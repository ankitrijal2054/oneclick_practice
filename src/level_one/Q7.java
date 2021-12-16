package level_one;

import java.util.Scanner;
//Prime or not
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a integer greater than one: ");
        boolean isPrime = true;
        int num = scan.nextInt();
        int i =2;
        do{
            if(num == 2){
                break;
            }
            else if(num % 2 == 0){
                isPrime = false;
                break;
            }
            else if(num % i == 0){
                isPrime = false;
                break;
            }
            i+=2;
        }while (i < Math.floor(num/2));

        if(isPrime){
            System.out.println("Prime!!");
        }
        else{
            System.out.println("Not Prime!!");
        }
    }

}
