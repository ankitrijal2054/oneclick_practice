package level_one;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Full Name : ");
        String name = scan.nextLine().toUpperCase();

        String[] splitName = name.trim().split("\\s+");

        String initial = "";

        for(int i= splitName.length-1; i>=0; i--){
            initial += (splitName[i].charAt(0) + ".");
        }

        System.out.println(initial);

    }
}
