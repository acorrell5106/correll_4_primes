/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correll_4_prime_methods;

/**
 *
 * @author acorrell5106
 */
public class Correll_4_prime_methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i + " is prime");
            }
            if(isEven(i)){
                System.out.println(i + " is even");
            }
            if(isOdd(i)){
                System.out.println(i + " is odd");
            }
        // TODO code application logic here
    }
    }
        // method - a little program that can recieve and return values to other methods
        static boolean isEven(int r) {
            return (r % 2 == 0);
}
        static boolean isOdd(int o) {
            return (o % 2 != 0);
        }
        static boolean isPrime(int p) {
            int divisor = 0;
            for(int i = 2; i < p; i++) {
                p += 1;
            }
        }
            if(divisor > 0) {
            return false;
            } else {
                return true;
            }
            }
        
           
               
           
        


