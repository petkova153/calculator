import java.util.Scanner;

public class calculator {
    //psvm to start a main function
    public static void main(String[] args) {
        System.out.println("calculator...");
        System.out.println("Calculating the sum of two numbers");
        System.out.println("Provide first number:");
        int num1;
        int num2;
        int sum;
        // TODO explain object relation
        Scanner inputreader;
        inputreader = new Scanner(System.in);
        num1 = inputreader.nextInt();
        System.out.println("you provided nr " + num1);
        num2 = inputreader.nextInt();
        System.out.println("you provided nr " + num2);
        sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
}
