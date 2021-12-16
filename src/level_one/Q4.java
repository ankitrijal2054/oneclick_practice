package level_one;
//swap two number without 3rd variable
public class Q4{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("Before swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
