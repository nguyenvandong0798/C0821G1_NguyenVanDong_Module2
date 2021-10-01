
import java.util.Scanner;

public class bai_tap_chuyen_so_thnh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a munber");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int dozens = (number - (hundreds * 100)) / 10;
        int units = (number - (hundreds * 100 + dozens * 10));
        String displayNum;
        String displayHun;
        String displayDoz;
        switch (dozens){
            case 1:
                displayDoz = " ten";
                break;
            case 2:
                displayDoz = "twenty";
                break;
            case 3:
                displayDoz = "thirty";
                break;
            case 4:
                displayDoz = "forty";
                break;
            case 5:
                displayDoz = "fifty";
                break;
            case 6:
                displayDoz = "sixty";
                break;
            case 7:
                displayDoz = "seventy";
                break;
            case 8:
                displayDoz = "eighty";
                break;
            case 9:
                displayDoz = "ninety";
                break;
            default:
                displayDoz = "";
                break;
        }
        System.out.print(displayDoz);
        switch (hundreds){
            case 1:
                displayHun = " one hundreds";
                break;
            case 2:
                displayHun = "two hundreds";
                break;
            case 3:
                displayHun = "three hundreds";
                break;
            case 4:
                displayHun = "four hundreds";
                break;
            case 5:
                displayHun = "five hundreds";
                break;
            case 6:
                displayHun = "six hundreds";
                break;
            case 7:
                displayHun = "seven hundreds";
                break;
            case 8:
                displayHun = "eight hundreds";
                break;
            case 9:
                displayHun = "nine hundreds";
                break;
            default:
                displayHun = "";
                break;
        }
        System.out.print(displayHun);
        switch (units) {
            case 1:
                displayNum = "one";
                break;
            case 2:
                displayNum = "two";
                break;
            case 3:
                displayNum = "three";
                break;
            case 4:
                displayNum = "four";
                break;
            case 5:
                displayNum = "five";
                break;
            case 6:
                displayNum = "six";
                break;
            case 7:
                displayNum = "seven";
                break;
            case 8:
                displayNum = "eight";
                break;
            case 9:
                displayNum = "nine";
                break;
            default:
                displayNum = "";
        }if (displayNum == ""){
            System.out.print("out of ability");
        }else{
            System.out.print(displayNum);
        }
        }
    }

