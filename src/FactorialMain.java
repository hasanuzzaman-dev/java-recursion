import java.util.Scanner;

public class FactorialMain {

    public static void main(String[] args) {

        System.out.println("Enter a number for factorial");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int fact = factorial(num);
        System.out.println("Factorial: "+fact);
    }

    private static int factorial(int num){
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1);

    }
}
