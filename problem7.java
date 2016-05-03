/*
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 What is the 10 001st prime number?
 */
package projecteuler;

/**
 *
 * @author sbenjamin
 */
public class problem7 {

    private static boolean isPrime(int num) {
        for (int i = 2; 2 * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long primeNumberLocation(int primeLocation) {
        int primeLoc = 1;
        int num = 1;

        // Count all the primes until primeLocation
        while (primeLoc < primeLocation) {
            num = num + 2;
            //System.out.println(primeLoc + " " + num);

            if (isPrime(num)) {
                primeLoc++;
            }
        }
        return num;
    }

}
