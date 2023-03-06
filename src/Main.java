import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double x;
        double y;
        char sign;
        double sum;
        double difference;
        double product;
        double quotient;
        // Take input from the user
        Scanner sc;

        sc = new Scanner(System.in);
        // take the inputs
        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/)");
        sign = '+';
        if (sign =='+')
            sum = x + y;
        else if (sign == '-')
            difference = x - y; //or difference = y -x;
        else if (sign == '*')
            product = x * y;
        else
            quotient = x / y;

        int result;
        result = 9%4;
        System.out.println("result");
    }
}