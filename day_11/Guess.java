package day_11;
import java.util.Scanner;

public class Guess {
    double number;

    public Guess(double number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        Guess g = new Guess(56);

        if (n < 100) {
            System.out.println("n is less than 100");
        } else if (n > 100) {
            System.out.println("n is greater than 100");
        } else {
            System.out.println("correct number");
        }

        sc.close();
    }
}
