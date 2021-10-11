package s06_inheritance.exercise.s1_circle;

public class Cylinder extends Circle {
    private double height;

        public Cylinder(){

        }
        public Cylinder(double height, double radius, String color){
            super(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
        public double getVolume(){
            return height * Math.PI * isRadius() * isRadius();
        }

    @Override
    public String toString() {
        return "Radius is = " + isRadius() +
                ", Volume = " + getVolume() + super.toString();
    }
}
