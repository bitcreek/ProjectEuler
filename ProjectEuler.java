package projecteuler;

/**
 *
 * @author sbenjamin
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        problem1 p1 = new problem1();
        System.out.println("Solution 1) Sum of all the multiples of 3 or 5 below 1000:" + p1.multipleOf(5, 3));

        problem2 p2 = new problem2();
        System.out.println("Solution 2) Find the sum of the even-valued terms:" + p2.fib(4000000));

        problem3 p3 = new problem3();
        System.out.println("Solution 3) Largest prime factor of the number 600851475143:" + p3.primeFactors(600851475143L));

        problem4 p4 = new problem4();
        System.out.println("Solution 4) Largest palindrome made from the product of two 3-digit numbers:" + p4.largestPalindrome());

        problem5 p5 = new problem5();
        System.out.println("Solution 5) Smallest positive number that is evenly divisible by all of the numbers from 1 to 20:" + p5.smallestDivisible(1, 10));

        problem6 p6 = new problem6();
        System.out.println("Solution 6) difference between the sum of the squares of the first one hundred natural numbers and the square of the sum:" + p6.diffOfSquares(1, 100));

        problem7 p7 = new problem7();
        //System.out.println("Solution 7) What is the 10,001st prime number:" + p7.primeNumberLocation(6));
        System.out.println("Solution 7) What is the 10,001st prime number:" + p7.primeNumberLocation(10001));

    }

}
