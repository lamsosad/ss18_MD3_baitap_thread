package bai1_threadclassic;

public class Bai1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("["+i + this.hashCode() + "]");
            try {
                Thread.sleep(500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread number1 = new Thread(new Bai1());
        Thread number2 = new Thread(new Bai1());
        number1.setPriority(Thread.MAX_PRIORITY);
        number2.setPriority(Thread.MIN_PRIORITY);
        number2.start();
        number1.start();
    }
}
