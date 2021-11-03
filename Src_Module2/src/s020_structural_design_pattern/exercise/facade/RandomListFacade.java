package s020_structural_design_pattern.exercise.facade;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;
    private java.util.List<Integer> List;

    public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter,
                            RandomList randomList, RandomNumber randomNumber) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
        this.randomNumber = randomNumber;
    }
    public void printRandomEvenList(List<Integer> numbers){
        this.listFilter.filterOdd(numbers);
        this.listPrinter.printList(numbers);
        this.randomList.generateList(5,3,4);
        this.randomNumber.generateInteger(2,6);
    }
}
