package bai2_chan_le;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i+",");
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
