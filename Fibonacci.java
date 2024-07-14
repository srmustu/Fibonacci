import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner rtf = new Scanner(System.in);

        String m1, m2, m3;
        int num, calculator = 0;

        m1 = "How many elements of a Fibonacci sequence do you want : ";


        System.out.print(m1);
        num = rtf.nextInt();
        int num1 = 0;
        int num2 = 1;


        System.out.print(num1+","+num2);
        for (int r = 1; r <= num; r++){
            int collector = num1 + num2;
            System.out.print(","+collector);
            num1 = num2;
            num2 = collector;


        }

    }
}
