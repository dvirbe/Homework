import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter starting number : ");
        int startNumber = scanner.nextInt();

        System.out.println("enter jump value : ");
        int sequenceIndex = scanner.nextInt();

        int sequenceLength;
        do {
            System.out.println("enter sequence length");
            sequenceLength = scanner.nextInt();
        } while (sequenceLength < 1);
        for (int i = 0; i < sequenceLength; i++) {
            System.out.println(startNumber+(sequenceIndex*i));
        }
    }
}
