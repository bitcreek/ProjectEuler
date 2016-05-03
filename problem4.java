/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers. 
 */
package projecteuler;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sbenjamin
 */
public class problem4 {

    public static boolean Ispalindrome(long number) {

        long reversedNumber, temp, num;

        reversedNumber = 0;
        temp = 0;
        num = number;

        // Check if reversed number is a palindrome
        while (num > 0) {
            temp = num % 10;
            num = num / 10;
            reversedNumber = reversedNumber * 10 + temp;
        }

        if (number == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static Set<Integer> largestPalindrome() {
        Set<Integer> productNumbers = new HashSet<>();
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 800; j--) {                
                int product = i * j;
                //System.out.println("i=" + i + ", j=" + j + " = "+product);
                if (Ispalindrome(product)) {                    
                    System.out.println("Palindrome:" + product);
                    productNumbers.add(i);
                    productNumbers.add(j);
                    return productNumbers;
                }
            }
        }
        return productNumbers;
    }

}
