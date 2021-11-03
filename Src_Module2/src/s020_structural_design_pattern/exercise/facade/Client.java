package s020_structural_design_pattern.exercise.facade;

import java.util.List;

public class Client {
    public void printRandomEvenList(List<Integer> numbers){
        RandomListFacade randomListFacade = new RandomListFacade(new ListFilter(),new ListPrinter(), new RandomList(),new RandomNumber());
        randomListFacade.printRandomEvenList(numbers);
    }
}
