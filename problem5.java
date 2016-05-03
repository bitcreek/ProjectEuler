/*
 Problem 5:
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
package projecteuler;

/**
 *
 * @author sbenjamin
 */
public class problem5 {

    public static int smallestDivisible(int min, int max) {
        int divisibleByAll;
        boolean divisible;

        // Brute Force
        divisibleByAll = max;
        divisible = false;

        while ((divisibleByAll % 2 != 0) || (divisibleByAll % 3 != 0) || (divisibleByAll % 4 != 0) || (divisibleByAll % 5 != 0)
                || (divisibleByAll % 6 != 0) || (divisibleByAll % 7 != 0) || (divisibleByAll % 8 != 0) || (divisibleByAll % 9 != 0)
                || (divisibleByAll % 10 != 0)
                || (divisibleByAll % 11 != 0)
                || (divisibleByAll % 12 != 0)
                || (divisibleByAll % 13 != 0)
                || (divisibleByAll % 14 != 0)
                || (divisibleByAll % 15 != 0)
                || (divisibleByAll % 16 != 0)
                || (divisibleByAll % 17 != 0)
                || (divisibleByAll % 18 != 0)
                || (divisibleByAll % 19 != 0)
                || (divisibleByAll % 20 != 0)) {
            // since we would need the number to be divisible by 20, we don't need to check every number
            divisibleByAll = divisibleByAll + max;

        }
        return divisibleByAll;
    }
}
