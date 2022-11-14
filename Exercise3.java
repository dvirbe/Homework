import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter odd number lager than 3");
            number = scanner.nextInt();
        } while (number < 5 || (number % 2) == 0);
        for (int i = number; i >0 ; i = i-2) {
            for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
            for (int j = number; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = number-2; i >0 ; i = i-2) {
            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print( " *");
            }
            System.out.println();
        }
      }
    }

