package threads.lecture2;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
//        Object obj = new Object();
////        synchronized (obj) {
////            obj.notify();
////        }
//        synchronized (obj) {
//            synchronized (obj) {
//                obj.notify();
//            }
//        }
        ThreadPractice threadPractice = new ThreadPractice();
        Printer printer1 = new Printer(threadPractice, 1);
        Printer printer2 = new Printer(threadPractice, 2);
        Printer printer3 = new Printer(threadPractice, 3);
        printer1.start();
        printer2.start();
        printer3.start();


    }

    public synchronized void print(int num) {
        System.out.println("Start thread " + num);
//        if (num == 3) {
//            this.notifyAll();
//        }
        try {
            this.wait(3000);
//            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End thread " + num);

    }
}
