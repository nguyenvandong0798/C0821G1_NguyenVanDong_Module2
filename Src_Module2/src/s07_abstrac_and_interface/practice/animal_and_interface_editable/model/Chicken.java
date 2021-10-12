package s07_abstrac_and_interface.practice.animal_and_interface_editable.model;

import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Animal;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Editable;

public class Chicken extends Animal implements Editable {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be tired" ;}
}
