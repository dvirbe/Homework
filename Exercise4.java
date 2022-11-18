import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeNumber;
        int count = 0;
        int number = 2;
        int dividerCount =0;
        do {
            System.out.println("how many prime number you want ?");
            primeNumber = scanner.nextInt();
        } while (primeNumber<=0);
        System.out.println(primeNumber + " prime numbers: ");

        while (count < primeNumber){
            for (int divider = 1; divider <= number;divider++ ) {
                if (number % divider == 0){
                    dividerCount++;
                }
                }if (dividerCount>2){
                    number++;
                    dividerCount=0;
                } else if (dividerCount==2) {
                count++;
                dividerCount=0;
                System.out.print(number +" ");
                number++;
                 }
             }
        }
    }
