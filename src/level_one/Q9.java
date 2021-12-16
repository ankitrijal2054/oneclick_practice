package level_one;

import java.util.Scanner;

//compare name
public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name1 : ");
        String name1 = scan.next();
        System.out.print("Enter Name2 : ");
        String name2 = scan.next();

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("Names are equal.");
        }
        else{
            System.out.println("Names are not equal");
        }
    }
}
