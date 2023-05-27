package lab_02;

import java.util.Scanner;

public class Lab_02_1 {

    public static void main(String[] args) {

        // Get input from user about height(cm) and weight(kg)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input you weight in kg: ");
        float yourWeight = scanner.nextFloat();

        System.out.print("Please input your height in cm: ");
        float yourHeight = scanner.nextFloat();

        // Calculate BMI
        float bmi =  yourWeight / ((yourHeight/100) * (yourHeight/100));
        System.out.println("Your BMI is: " + bmi);

        if(bmi <=18.5){
            System.out.println("You are underweight");
        } else if (bmi <= 24.9){
            System.out.println("You are normal weight");
        } else if (bmi <= 29.9){
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity");
        }
    }
}
