import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("check if number is a Fibonacci number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int number1 = 0;
        int number2 = 1;
        while (sum < number) {
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
        if (number == sum){
            System.out.println(number + " is a Fibonacci number!");
        } else {
            System.out.println(number + " is not a Fibonacci number :( ");
        }
      }
}