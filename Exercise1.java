import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter parameter A");
        double parameterA = scanner.nextInt();

        System.out.println("enter parameter B");
        double parameterB = scanner.nextInt();

        System.out.println("enter parameter C");
        double parameterC = scanner.nextInt();

        double preSquareRoot = parameterB * parameterB - 4 * parameterA * parameterC;
        double x1;
        double x2;
        if (preSquareRoot < 0) {
            System.out.println("not a number");

        } else{
            double postSquareRoot = Math.sqrt(preSquareRoot);
            x1 = (-parameterB + postSquareRoot) / (2 * parameterA);
            x2 = (-parameterB - postSquareRoot) / (2 * parameterA);

            if (x1 == x2) {
                System.out.println("x1= " + x1);
            } else {
                System.out.println("x1 = "+ x1 +"\t\tx2 = " +x2);
            }
        }
    }
}



