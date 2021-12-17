package level_one;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No: ");
        int row = scan.nextInt();
        int i, j;

        for (i=0; i<row; i++)
        {
            for (j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
