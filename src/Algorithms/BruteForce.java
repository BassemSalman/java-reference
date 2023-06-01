package Algorithms;
public class BruteForce {
        /* Brute Force : Straighforward Approach
         * Trying every possible option to find solution
         * (not most efficient but guarantee correct solution)
         */

        // here, many function calls are done for a certain n
        public int fibonacci(int n){
            if(n<=0) return 0;
            if(n == 1 || n == 2) return 1;
            return fibonacci(n-1) + fibonacci(n-2);
        }


        // much less time and space complexity
        // dynamic programming approach (covered in other file)
        public int fibonacciDynamic(int n){
            if(n == 1 || n == 2) return 1;
            if(n == 0) return -1;

            int a[] = new int[n];
            // a[i-1]
            a[0] = 1;
            a[1] = 1;
            for(int i = 2; i<=n+1; i++) {
                a[i] = a[i-1] + a[i-2];
            }
            return a[n+1];
        }

        
}