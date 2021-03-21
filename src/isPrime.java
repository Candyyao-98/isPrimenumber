import java.util.Scanner;

import static java.lang.Math.sqrt;

public class isPrime {
    public static boolean isPrime(int input) {
        //check if the input number is prime or not
        if (input == 1) return false;
        for (int i = 2; i <= sqrt(input); ++i) {
            if (input % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number please: ");
        // Scanner the input number and store as integer type 
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        if (number < 0) {
            System.out.println("Wrong input number, please input a positive number");
        } else {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
                System.out.println("Please try again");
            }
        }
    }
}
