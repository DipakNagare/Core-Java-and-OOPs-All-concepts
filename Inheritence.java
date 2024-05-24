
class A {

    int a = 10;
    static int b = 20;

    {
        System.out.println("intence block of A class");
    }

    static {
        System.err.println("static block of A class");
    }

    void showA1() {
        System.out.println(" Intence method of A class");
    }

    static void showA2() {
        System.out.println("Static Method of A class");
    }

    A() {
        System.out.println("defalut constructor");
    }
}

class B extends A {

    void showAll(){
        System.out.println(a);
        System.out.println(b);

    }

}

public class Inheritence {
    public static void main(String[] args) {
        B bcha = new B();
        bcha.showAll();
    }
}
