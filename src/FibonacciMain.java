import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int fibonacci = fib(number);

        if (fibonacci < 0) {
            System.out.println("Error number");

        }else {
            System.out.println("Fibonacci number: "+fibonacci);
        }
    }

    private static int fib(int number) {

        if (number < 1) {
            return -1;
        } else if (number == 1 || number == 2) {
            return number - 1;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }
}
