import java.util.Scanner;

class BMICalc{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your height in meters: ");
        float height = input.nextFloat();
        System.out.println("Input your weight in kilograms");
        float weight = input.nextFloat();
        double bmi = weight / (height * height);
        System.out.println("Your result is "+ bmi);
    }
}