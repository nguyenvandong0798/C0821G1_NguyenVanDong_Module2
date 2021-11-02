package s019_design_pattern.practice.factory_method;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "MEOO";
    }
}
