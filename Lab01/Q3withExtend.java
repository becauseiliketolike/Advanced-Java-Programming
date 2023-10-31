// Q.3 Create two thread to display odd and even numbers between 1 and 100. Each numbers should be displayed in span of 2 seconds.

class OddThread extends Thread {
    public void run() {
        try{
            for(int i=1; i<101; i++) {
                if (i%2 != 0) {
                    System.out.println("Odd Thread: " + i);
                }
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        try{
            for(int i=1; i<101; i++) {
                if(i%2 == 0) {
                    System.out.println("Even Thread: " + i);
                }
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Q3withExtend {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        even.start();
    }
}
