package level_one;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No: ");
        int num = scan.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
