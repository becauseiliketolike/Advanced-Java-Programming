// Q.3 Create two thread to display odd and even numbers between 1 and 100. Each numbers should be displayed in span of 2 seconds.

class OddThread implements Runnable {
    public void run() {
        for(int i=1; i<101; i++) {
            if (i%2 != 0) {
                System.out.println("Odd");
            }
        }
    }
}
class EvenThread implements Runnable {
    public void run() {
        for(int i=1; i<101; i++) {
            if (i%2 == 0) {
                System.out.println("Even");
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        for(int i=0; i<2; i++) {
            Thread thread1 = new Thread(oddThread);
            Thread thread2 = new Thread(evenThread);
            thread1.start();
            Thread.sleep(2000);
            thread2.start();
            Thread.sleep(2000);
        }
    }
}