// Q.2 Write a program in which two threads A, B will share same resource from the class Resource. 
// Make sure that the resource are shared without exception.

class Resource {
    public int x = 0;
    public synchronized void Increment(String threadName) { 
        x++; 
        System.out.println("Running " + threadName +  ": " + x);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread A = new Thread() {
            public void run() { resource.Increment("A"); }
        };
        Thread B = new Thread() {
            public void run() { resource.Increment("B"); }
        };
        A.start();
        B.start();
    }
}