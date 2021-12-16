package level_one;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Add \n2. Subtract \n3. Mul \n4. Div \n5. Quit\n Please Choose to calculate: ");
        int choice = scan.nextInt();

        while(choice != 5) {
            System.out.print("Enter 1st Number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter 1st Number: ");
            double num2 = scan.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("result = " + Add(num1, num2));
                    break;
                case 2:
                    System.out.println("result = " + Sub(num1, num2));
                    break;
                case 3:
                    System.out.println("result = " + Mul(num1, num2));
                    break;
                case 4:
                    System.out.println("result = " + Div(num1, num2));
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            System.out.println();
            System.out.print("1. Add \n2. Subtract \n3. Mul \n4. Div \n5. Quit\n Please Choose to calculate: ");
            choice = scan.nextInt();
        }
    }

    public static double Add(double a, double b){
        double res = a + b;

        return res;
    }

    public static double Sub(double a, double b){
        double res = a - b;

        return res;
    }

    public static double Mul(double a, double b){
        double res = a * b;

        return res;
    }

    public static double Div(double a, double b){
        double res = a / b;

        return res;
    }
}

