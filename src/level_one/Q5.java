package level_one;

import java.util.Scanner;

//positive or negative
public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double num = scan.nextDouble();

        if(num < 0){
            System.out.println("Negative number");
        }
        else {
            System.out.printf("Positive number");
        }
    }
}
