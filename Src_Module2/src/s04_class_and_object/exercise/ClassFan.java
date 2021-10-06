package s04_class_and_object.exercise;

public class ClassFan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";
    private String infor;

    public ClassFan(final int FAST, double radius, String color, String infor){
        this.radius = radius;
        this.color = color;
        this.infor = infor;
    }


    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(3,10, "yelow", "fan is on");
        System.out.println("fan1:");
        System.out.print("speed: " + fan1.FAST+ " ");
        System.out.print("radius: " + fan1.radius+ " ");
        System.out.print("color: " + fan1.color+ " ");
        System.out.println("Status: " + fan1.infor+ " ");

        ClassFan fan2 = new ClassFan(1,5, "blue", "fan is off");
        System.out.println("fan2:");
        System.out.print("speed: " + fan2.MEDIUM + " ");
        System.out.print("radius: " + fan2.radius+ " ");
        System.out.print("color: " + fan2.color+ " ");
        System.out.print("Status: " + fan2.infor);
    }
}
