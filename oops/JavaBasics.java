// public class JavaBasics {
//     public static void main(String args[]) {
//         // System.out.println("Java Basics");
//         int a = 10;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);
//         String name = "Tony Stark";
//         System.out.println(name);

//         a = b;
//         System.out.println(a);

//         int c = 10;
//         int d = 5;

//         int sum = c + d;

//         System.out.println(sum);

//     }

// }
import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // String input=sc.next();
        // System.out.println(name);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);
        /*
         * 
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = a + b;
         * System.out.println(sum);
         * 
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int product = a * b;
         * System.out.println(product);
         */
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

    }
}
