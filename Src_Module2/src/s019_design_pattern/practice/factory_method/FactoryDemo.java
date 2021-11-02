package s019_design_pattern.practice.factory_method;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal= animalFactory.getAnimail("feline");
        System.out.println("animal sound: " + animal);
        Animal animal1 =animalFactory.getAnimail("canine");
        System.out.println("animal sound: " + animal);
    }
}
