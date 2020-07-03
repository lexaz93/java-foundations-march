package threads.hw;

public class PrinterWordHello extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(4950);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Hello ");
        }
    }
}
