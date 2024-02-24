package t2;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
       System.out.println(factorialRecursive(10));
   }
    static int factorialForLoop(int N) {
        int resFact = 1;
        if (N >= 0) {
            for (int i = 1; i <= N; i++) {
                resFact *= i;
            }
            return (resFact);
        } else {
            return 0;
        }
    }
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}
