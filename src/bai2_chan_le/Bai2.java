package bai2_chan_le;

public class Bai2 {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        System.out.println("số lẻ");
        oddThread.start();
        oddThread.join();
        System.out.println("\nsố chẵn");
        evenThread.start();
        evenThread.join();
    }
}
