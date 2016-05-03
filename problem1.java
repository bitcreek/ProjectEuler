/*
* Multiples of 3 and 5
* Problem 1
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*/

package projecteuler;

/**
 *
 * @author sbenjamin
 */
public class problem1 {
   int max = 1000;
   int sum = 0;
   
   public Integer multipleOf(int a, int b) {
        for(int i = 1; i<max; i++) {
             if ((i%a==0) || (i%b==0)) {
            sum = sum + i;
             }
        }
    return sum;    
   }
}