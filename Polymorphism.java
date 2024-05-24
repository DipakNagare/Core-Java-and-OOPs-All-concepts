class PolymorphismExample {

    // method overloading example ----------->

    void m1() {
        System.out.println("OverloadingExample1");
    }

    int m1(int a) { // insead of void all method have return type otherwise they showing the error
        System.out.println("OverloadingExample2");
        return a;
    }

    public void m1(byte b) {
        System.out.println("OverloadingExample3");
    }

    void m1(int a, String b) {
        System.out.println("OverloadingExample4");
    }

    void m1(String a, int b) {
        System.out.println("OverloadingExample5");
    }

    // <------------------

    // overriding Methods ------------->

    void overridingExample1() {
        System.out.println("overridingExample2");
    }

    private void overridingExample2() { // it is not accessible in sub classs beacuse it is private method and if we try
                                        // to create same method in sub class then that sub class treated this as a new
                                        // method in sub class
        System.out.println("overridingExample2");
    }

    public void overridingExample3() { // to access this method in sub class then use access modifire Public only not
                                       // another otherwise the give error.
        System.out.println("overridingExampl2");
    }

}

class B extends PolymorphismExample { // sub class of super class PolymorphismExample

    // overriding Methods ------------->

    void overridingExample1() {
        System.out.println("overridingExampl in Sub class");
    }

    public void overridingExample2() {
        System.out.println("overridingExamp2x in Sub class");
    }

    public void overridingExample3() {
        System.out.println("overridingExamp3 in Sub class");
    }

}

public class Polymorphism {
    public static void main(String[] args) {

        // Overloading ------------>
        PolymorphismExample overloading = new PolymorphismExample();
        overloading.m1();
        overloading.m1(20);
        overloading.m1((byte) 20);
        overloading.m1(25, "Virat");
        overloading.m1("Dipak", 21);

        // <--------------

        // dynamic dispatch ----------->

        PolymorphismExample P = new PolymorphismExample();
        PolymorphismExample dynamicDispatch = new B(); // here we assign sub class obejct reference to the super class
                                                       // reference veriable

        // <--------------

        // overriding Methods ------------->

        // PolymorphismExample overriding = new B();
        // overriding.overridingExample1();

        // <---------------

    }
}