import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeNumber;
        int count = 0;
        int number = 2;
        int dividerFailCount =0;
        do {
            System.out.println("how many prime number you want ?");
            primeNumber = scanner.nextInt();
        } while (primeNumber<=0);
        System.out.println(primeNumber + " prime numbers: ");

        while (count < primeNumber){
            for (int divider = 1; divider <= number;divider++ ) {
                if (number % divider == 0){
                    dividerFailCount++;
                }
                }if (dividerFailCount>2){
                    number++;
                    dividerFailCount=0;
                }if (dividerFailCount==2){
                    count++;
                    dividerFailCount=0;
                    System.out.print(number +" ");
                    number++;
                }
         }
        }
    }
