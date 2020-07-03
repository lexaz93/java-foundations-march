package threads.lecture1;

import org.w3c.dom.ls.LSOutput;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.print("F ");
//        }

//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2500);
//            System.out.print("S ");
//        }

//        System.out.println(Thread.currentThread().getName() + " START");
//        PrinterS printerSecond = new PrinterS();
////        printerSecond.setDaemon(true);
////        printerSecond.setPriority(Thread.MIN_PRIORITY);
//        printerSecond.start();
//
//        PrinterF printerFirst = new PrinterF();
//        Thread tPrinterF = new Thread(printerFirst);
////        System.out.println(tPrinterF.getName());
////        tPrinterF.setPriority(Thread.MAX_PRIORITY);
////        tPrinterF.setDaemon(true);
//        tPrinterF.start();
//
//        tPrinterF.join();
//        printerSecond.join();
//        System.out.println("\n" + Thread.currentTehread().getName() + " END");
//        Thread.currentThread().join(); //Deadlock

        Thread thread = new Thread() {   //Анонимный класс, для создания 1 экземпляра.
            @Override
            public void run() {
                System.out.println(2);
            }
        };

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(3);
//            }
//        };
        Runnable runnable = () -> {    // с помощью лямбда выражения, тк 1 метод в интерфейсе
            System.out.println(3);
            System.out.println(3);
        };
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();

        new Thread(() ->  System.out.println(4)).start();



    }
}
