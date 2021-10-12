package s07_abstrac_and_interface.practice.animal_and_interface_editable.controler;

import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Animal;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.model.Chicken;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.model.Tiger;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Editable;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.model.Apple;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.service.Fruit;
import s07_abstrac_and_interface.practice.animal_and_interface_editable.model.Orange;

public class AbstractAndIterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Editable editable = (Chicken) animal;
                System.out.println(editable.howToEat());
            }
            if (animal instanceof Tiger){
                Editable editable = (Tiger) animal;
                System.out.println(editable.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits ){
            System.out.println(fruit.howToEat());
        }
    }
}
