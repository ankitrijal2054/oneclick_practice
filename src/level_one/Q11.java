package level_one;

import java.util.Locale;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Full Name : ");
        String name = scan.nextLine().toUpperCase();

        String[] splitName = name.trim().split("\\s+");

        String initial = "";

        for(String str: splitName){
            initial += (str.charAt(0) + ".");
        }

        System.out.println(initial);

    }
}
