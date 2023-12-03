// Q.1 Write a program to show the use of throws and finally keyword. 
// Write a program in such a way that the statement in the finally block will not be executed.

class AgeException extends Exception {
    public AgeException(String error) {
        super(error);
    }
}

public class Q1 {
    static void test(int age) throws AgeException {
        if (age < 20) {
            throw new AgeException("Age not valid");
        }
    }
    
    public static void main(String[] args) {
        try {
            test(21);
            System.out.println("Age valid");
            System.exit(0);
        } catch(AgeException e) {
            System.out.println(e);
            System.exit(0);
        } finally {
            System.out.println("I won't be executed");
        }
    }
}