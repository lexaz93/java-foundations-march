package threads.hw;

import lombok.SneakyThrows;

public class ThreadsHW {
    @SneakyThrows
    public static void main(String[] args) {
        PrinterWordHello hello = new PrinterWordHello();
        PrinterWordWorld world = new PrinterWordWorld();
        Thread tWorld = new Thread(world);
        System.out.println("Start");

        hello.setPriority(10);
//        tWorld.setDaemon(true); //после окончания хэллоу тВорлд тоже заканчивается
        hello.start();
        tWorld.start();
        hello.join(); //мэйн ждет звершения хэллоу
        tWorld.join();

        System.out.println("End");

        hello.interrupt();
        tWorld.interrupt();

        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread() {  //анонимный класс наследованный от thread
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        };
        thread.start();

        Runnable runnable = () -> System.out.println("Lambda"); //лямбда выражение
        Thread lambda = new Thread(runnable);
        lambda.start();





    }
}
