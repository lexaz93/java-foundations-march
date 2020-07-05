package threads.lecture2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Printer extends Thread {
    private final ThreadPractice threadPractice;
    private int num;

    @Override
    public void run() {
        threadPractice.print(num);

    }
}
