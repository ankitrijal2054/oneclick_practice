package level_one;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No 1: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter No 2: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter No 3: ");
        double num3 = scan.nextDouble();
        System.out.println();

        System.out.println("The sum of no. is: " + (num1+num2+num3));
    }
}
