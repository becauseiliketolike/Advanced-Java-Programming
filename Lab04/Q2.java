// Q.2 Write a program in which two threads A, B will share same resource from the class Resource. Make sure that the resource are shared without exception.

class Resource {
    public int x = 0;
    public synchronized void Increment() { 
        x++; 
        System.out.println(x);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread A = new Thread() {
            public void run() { resource.Increment(); }
        };
        Thread B = new Thread() {
            public void run() { resource.Increment(); }
        };
        A.start();
        B.start();
    }
}