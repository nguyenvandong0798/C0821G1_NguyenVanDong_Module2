package s07_abstrac_and_interface.practice.animal_and_interface_editable.model;

import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Animal;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Editable;

public class Tiger extends Animal implements Editable {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "could be tired" ;
    }
}
