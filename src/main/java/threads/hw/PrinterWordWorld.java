package threads.hw;

public class PrinterWordWorld implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("World!");
        }

    }
}
