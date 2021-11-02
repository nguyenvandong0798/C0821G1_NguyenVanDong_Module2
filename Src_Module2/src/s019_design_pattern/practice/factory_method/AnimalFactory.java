package s019_design_pattern.practice.factory_method;

public class AnimalFactory {
    public Animal getAnimail(String type) {
        if ("canine".equals(type)){
            return new Dog();
        }else{
            return new Cat();
        }

    }
}
