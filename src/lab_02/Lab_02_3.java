package lab_02;

import java.util.Scanner;

public class Lab_02_3 {

    public static void main(String[] args) {

        // Normal weight: BMI = 18.5 - 24.9

        // Get input from user about height(cm) and weight(kg)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input you weight in kg: ");
        float yourWeight = scanner.nextFloat();

        System.out.print("Please input your height in cm: ");
        float yourHeight = scanner.nextFloat();

        // Calculate BMI
        float bmi =  yourWeight / ((yourHeight/100) * (yourHeight/100));
        System.out.println("Your BMI is: " + bmi);

        float increaseWeight = (float) (18.5 - bmi);
        float decreaseWeight = (float) (bmi - 29.9);

        if (bmi < 18.5) {
            System.out.printf("=> You need to increase %.2f kg", increaseWeight);
        } else if (bmi <= 24.9) {
            System.out.println("=> You are perfect");
        } else {
            System.out.printf("=> You need to decrease %.2f kg", decreaseWeight);
        }
    }
}