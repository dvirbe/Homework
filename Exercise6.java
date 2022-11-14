import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to check sum of digits :");
        int number = scanner.nextInt();
        int sum= 0;
    while (number>0){
        int lastDigit = number%10;
        sum+=lastDigit;
        number = number/10;
        }
        System.out.println("sum of digits is : "+sum);
    }
}


