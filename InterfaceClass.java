
interface In1 {
    /*if we create any veriable inside the the interface then they by default must
    be public static final */
    int a = 20;
    public static final int b = 30;
    final int c = 40;

    // if we crate method then that method by default public abstract
    void m1();

    public abstract void m2();

    // they also allo the static and default method in Interface

    // static void m3() {
    // // method implementation.
    // }

    // default void m4() {
    // // method implementation.
    // }

}

 abstract class In2 implements In1 {
    // in this also we want to override the superclass method otherwise they give error and if you not override all methods of super class then use abstract keyword before the class difine.

    public void m1() { // they give error if can cant use visibility of m1(); and visibility is public.
        System.out.println("M1 is in In2");
    }
}

class In3 extends In2 {
    public void m2(){
    System.out.println("M2 is in In3");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
    //  we can not cerate object of interfece so we use to access inside member of interface reference veriable

    In1 interfaceRef = null;
    interfaceRef = new In3(); // reference veriable
    interfaceRef.m1(); // here the first check this m1() is singiture avialbe inside the superclass or not if it is there then the executed the method 
    interfaceRef.m2();
    }

}
