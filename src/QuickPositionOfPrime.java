import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuickPositionOfPrime {

    static final int limit = 10000; 
    static int []position = new int[limit + 1]; 

    // Function to precompute the position 
    // of every prime number using Sieve 
    static void sieve() 
    { 
        // 0 and 1 are not prime numbers 
        position[0] = -1; 
        position[1] = -1; 

        // Variable to store the position 
        int pos = 0; 
        for (int i = 2; i <= limit; i++) { 
            if (position[i] == 0) { 

                // Incrementing the position for 
                // every prime number 
                position[i] = ++pos; 
                for (int j = i * 2; j <= limit; j += i) 
                    position[j] = -1; 
            } 
        } 
    } 

    public static boolean isPrime(int input) {
        return position[input] != -1; //check if input is prime number or not.
    }

    public static void main(String[] args) {
        sieve(); // call the function
        System.out.println("Enter a number please: ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt(); // Scanner the input
        if (number <= 0) {
            System.out.println("Wrong input number, please input a positive number");// prime number cannot smaller or equal to 0
        } else if (number > limit) {
            System.out.println("Input number is too large, please input a number smaller than " + limit);
        } else {
            if (isPrime(number)) {
                System.out.println(number + " is the prime number at position " + position[number]);
            } else {
                System.out.println(number + " is not a prime number");
                System.out.println("Please try again");
            }
        }
    }
}
