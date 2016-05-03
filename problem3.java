/*
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package projecteuler;   

import java.util.HashSet; 
import java.util.Set;


/**
 *
 * @author sbenjamin
 */
public class problem3 {
    
   public static Set<Integer> primeFactors(long number) { 
       Set<Integer> primefactors = new HashSet<>();
       long copyOfInput = number; 
       
       for (int i = 2; i <= copyOfInput; i++) { 
           if (copyOfInput % i == 0) { 
               primefactors.add(i);
               copyOfInput /= i;
               i--;
            } 
       }
       return primefactors;
   }
}
