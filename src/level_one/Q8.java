package level_one;
//get age from dob
import java.util.Calendar;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year (DOB) YYYY : ");
        int dob = scan.nextInt();

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        System.out.println("You are " + (year - dob) + " years old.");

    }
}
