package s015_IOstream.exercise.s02_read_file.controler;

import s015_IOstream.exercise.s02_read_file.model.Nation;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Nation> readCSV(){
        List<Nation> nationList = new ArrayList<>();
        BufferedReader buffRead = null;

        try {
            FileReader fileReader = new FileReader("nation.csv");
            buffRead = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Nation nation;
            while ((line = buffRead.readLine()) != null){
                temp = line.split(",");
                nation = new Nation(Integer.parseInt(temp[0]), temp[1], temp[2]);
                nationList.add(nation);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return nationList;
    }
    public static void main(String[] args) {
        List<Nation> nation = readCSV();
        for (Nation nation1: nation) {
            System.out.println(nation1);
        }
    }
}
