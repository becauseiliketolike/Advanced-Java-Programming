// Q.3 Create two thread to display odd and even numbers between 1 and 100. 
// Each numbers should be displayed in span of 2 seconds.

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class EvenThread implements Runnable {
    public void run() {
        for (int i = 2; i < 101; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);
        thread1.start();
        thread2.start();
    }
}