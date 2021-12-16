package level_one;

import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Full Name : ");
        String name = scan.nextLine().toLowerCase();

        String[] splitName = name.trim().split("\\s+");

        splitName[splitName.length-1] = splitName[splitName.length-1].toUpperCase();

        System.out.println(String.join(" ", splitName));

    }
}
