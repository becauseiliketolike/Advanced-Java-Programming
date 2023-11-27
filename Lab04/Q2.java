// Q.2 Write a program in which two threads A, B will share same resource from the class Resource. Make sure that the resource are shared without exception.


class Resource {
    public int x = 0;
    public synchronized void Increment() { 
        x++; 
        System.out.println(x);
    }
}


class A extends Thread {
    public Resource resource;
    public A(Resource resource) {
        this.resource = resource;
    }
    public void run() {
        try {
            this.resource.Increment();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class B extends Thread {
    public Resource resource;
    public B(Resource resource) {
        this.resource = resource;
    }
    public void run() {
        try {
            this.resource.Increment();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        A a = new A(resource);
        B b = new B(resource);
        a.start();
        b.start();
    }
}