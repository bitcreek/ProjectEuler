/*
 The sum of the squares of the first ten natural numbers is,

 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)^2 = 55^2 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package projecteuler;

/**
 *
 * @author sbenjamin
 */
public class problem6 {

    public static int sumOfSquares(int min, int max) {
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum = sum + (int) (Math.pow(i, 2));
        }
        return sum;
    }

    public static int sumOfNaturalNumSquared(int min, int max) {
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum = sum + i;
        }
        sum = (int) (Math.pow(sum, 2));
        return sum;
    }

    public static int diffOfSquares(int min, int max) {

        int sum_of_squares = sumOfSquares(min, max);
        int sum_of_natural_squared = sumOfNaturalNumSquared(min, max);
        return sum_of_natural_squared - sum_of_squares;

    }

}
