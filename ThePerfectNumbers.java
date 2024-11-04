import java.util.ArrayList;
import java.util.List;

public class ThePerfectNumbers {
    public static void main(String[] args) {
        int limit = 200;
        List<Integer> perfectNumbers = findPerfectNumbers(limit);

        System.out.println("Answer"+":" + perfectNumbers);
    }

    public static List<Integer> findPerfectNumbers(int limit) {
        List<Integer> perfectNumbers = new ArrayList<>(); // List to hold perfect numbers

        // Loop through each number from 1 to the limit
        for (int num = 1; num <= limit; num++) {
            int sumOfDivisors = 0; // Variable to hold the sum of divisors

            // Nested loop to find divisors
            for (int divisor = 1; divisor < num; divisor++) {
                if (num % divisor == 0) { // Check if the divisor is a proper divisor
                    sumOfDivisors += divisor; // Add to the sum of divisors
                }
            }

            // Check if the sum of divisors equals the number
            if (sumOfDivisors == num) {
                perfectNumbers.add(num); // Add to the list of perfect numbers
            }
        }

        return perfectNumbers; // Return the list of perfect numbers
    }
}