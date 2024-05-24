class AException extends Exception {
    // checked exception or compile time exception we want to handle this exception code

}

class BException extends RuntimeException {
    // Unchecked Exception or Run time exception its handle in Run time.

}

class Show {
    void Exceptn1() throws AException { // throws tell us to show inside content AException class if exception is coming compile time exception
        System.out.println("Exceptn1 in Show class");
    }

    void Exceptn2() throws BException {
        // runtime exception
        System.out.println("Exceptn2 in Show class");
    }

}

public class ExceptionHandling {
    public static void main(String[] args) {
        Show So = new Show();  /* So.Exceptn1(); // if we try to called this Exceptn1 method of Show class then
                                 they shoing error because we want to handle compile tme Exception always and
                                 for that we use Try and Catch block. */ 
        try {
            So.Exceptn1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}