package s07_abstrac_and_interface.practice.animal_and_interface_editable.model;

import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Fruit;

public class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
