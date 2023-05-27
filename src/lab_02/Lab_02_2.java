package lab_02;

import java.util.Scanner;

public class Lab_02_2 {

    public static void main(String[] args) {

        // Get input from user about a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int yourNum = scanner.nextInt();
        if (yourNum % 2 == 0) {
            System.out.print("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
    }
}
