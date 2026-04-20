
package recursion;

import java.util.*;

/**
 *
 * @author Ryle
 */

public class Recursion {

    public static void countUp(int n) {
        if (n == 10) {
            System.out.println(" | You've reached " + n);

        } else {
            n++;
            System.out.print(" " + n);
            countUp(n);
        }
    }

    public static void countDown(int n) {
        if (n == 0) {
            System.out.print(" | Done ");
        } else {
            System.out.print(" " + n);
            n--;
            countDown(n);
        }
    }

    public static int power2(int base, int num) {
        if (num == 1) {
            return base;
        } else {
            return base * power2(base, num - 1);
        }
    }

    public static int catEyes(int cats) {

        if (cats == 0) {
            return 0;
        } else {
            return 2 + catEyes(cats - 1);
        }

//        if (cats == cats * 2) {
//            return;
//        } else {
//            System.out.println(cats * 2);
//            catEyes(cats);
//      }
    }
//My answer, incorrect since it just prints the numbers without adding them

    public static void Power(int num, int numToPower) {
        int result = 1;
        if (numToPower == 0) {
            System.out.println(num);
        } else {
            result = result * num;
            numToPower--;
            Power(num, numToPower);

        }

    }

    //Videos
//    public static int power2(int base, int num) {
//        if (num == 1) {
//            return base;
//        } else {
//            return base * power2(base, num - 1);
//
//        }
//
//    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);//factorial(n)*n-1;

        }
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static int mobileSpeakers(int mobile) {
        if (mobile == 0) {
            return 0;
        } else {
            if (mobile % 2 == 0) {
                return 2 + mobileSpeakers(mobile - 1);
            } else {
                return 1 + mobileSpeakers(mobile - 1);
            }
        }
    }

    public static int sum(int num) {
        if (num <= 9) {
            return num;
        } else {
            return num % 10 + sum(num / 10);
        }
    }

    public static int count5(int num) {
        if (num <= 9) {
            if (num == 5) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (num % 10 == 5) {
                return 1 + count5(num / 10);
            } else {
                return 0 + count5(num / 10);
            }
        }
    }

    public static int binarySearch(int[] array, int key, int start, int end) {
        if (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > key) {
                return binarySearch(array, key, start, middle - 1);
                }else if (array[middle] < key) {
                        return binarySearch(array, key, middle + 1, end);
                        }
                else {return middle;}
            }else{
            return -1;
            }
        }
    public static int collatz(int n){
        int steps=0;
    if(n==1){
        return 1;
    }
    else if(n%2==0){
        collatz(n/2);
        steps++;
        System.out.println(steps);
    }
    else if(n/2!=0){
        collatz(3*n+1);
        steps++;
        return steps;
    }
        return 0;
    }

    public static void main(String[] args) {
        //collatz(3);
        
//        countUp(0);
//        //1. print numbers
//        countDown(5);
//        //2. cat eyes
//        //catEyes(4);
//        System.out.println("Cat Eyes: " + catEyes(5));
//        //3. power, my one
//        // Power(2, 4);
//
//        System.out.println(power2(2, 4));
        //own thing factorial
//        factorial(5);
//        System.out.println(factorial(4));
        System.out.println(power2(3, 2));
//        System.out.println(fibonacci(6));
       System.out.println(mobileSpeakers(4));
//        System.out.println(sum(135));
//        System.out.println(1 / 10);
//        System.out.println("Counting 5: "+ count5(3565));
//int numbers=35;
//
//        System.out.println("Checking if " + numbers + " remaider is equal to 5: ");
//        int result=numbers/10;
//        if(numbers%10==5){
//            System.out.println("Remainder: "+numbers%10);
//            System.out.println("Result of division:" + result); 
//            
//        }
//        System.out.println("ahh");
    }

}

