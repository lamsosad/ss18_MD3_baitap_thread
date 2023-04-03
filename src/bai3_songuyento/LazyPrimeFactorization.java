package bai3_songuyento;

import java.util.ArrayList;
import java.util.List;

public class LazyPrimeFactorization implements Runnable {
    private int current = 2;
    private List<Integer> primeNumbers = new ArrayList<Integer>();

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (isPrime(current)) {
                primeNumbers.add(current);
                System.out.println("LazyPrimeFactorization: " + current);
            }
            current++;
        }
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

