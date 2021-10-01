import java.util.Scanner;

public class thuc_hanh_tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;
        System.out.println("enter your weight");
        weight = scanner.nextDouble();
        System.out.println("enter your height");
        height = scanner.nextFloat();
        bmi = weight / Math.pow(height,2);
        if (bmi < 18.5)
        System.out.println("Underweight");
        else if (bmi < 25 )
        System.out.println("Normal");
        else if (bmi < 30 )
        System.out.println("Overweight");
        else
        System.out.println("Obese");


    }
}
