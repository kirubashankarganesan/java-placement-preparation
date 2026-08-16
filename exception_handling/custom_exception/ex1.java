package exception_handling.custom_exception;

class AgeException extends Exception {

    AgeException(String message) {
        super(message);
    }
}

class ageokexception extends Exception {

    ageokexception(String message) {
        super(message);
    }
}

public class ex1 {

    static void checkAge(int age) throws AgeException,ageokexception {

        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        }else{
            throw new ageokexception(" you are eligible to vote");
        }

    }

    public static void main(String[] args) {
        try {
            checkAge(20);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } catch (ageokexception e) {
            System.out.println(e.getMessage());
        }
    }
}
