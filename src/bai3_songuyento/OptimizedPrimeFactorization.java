package bai3_songuyento;

import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements Runnable {
    private int currentNumber = 2;
    private List<Integer> primeNumbers = new ArrayList<Integer>();

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (isPrime(currentNumber)) {
                primeNumbers.add(currentNumber);
                System.out.println("OptimizedPrimeFactorization: " + currentNumber);
            }
            currentNumber++;
        }
    }

    private boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
