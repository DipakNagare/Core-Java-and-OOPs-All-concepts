/*
interface In1 {
    // it is a Marker interface because they do not have any data member and member funcation.
}

interface In2 {
    void m1(); // this if funcational interface because they contened only one abstract method inside the interface class.
}

*/

interface In4 {
    int a = 20;
}
interface In5{
    int a = 20;
}

class multipleInheret implements In4, In5 {
    void m2() {
        System.out.println("m2 inside the multipleInheret class");
        System.out.println(In4.a); // if in both interce class same name veriable is there then use interface class name to access the perticuler veriable.
        System.out.println(In5.a);
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        multipleInheret MI = new multipleInheret();
        MI.m2();
    }
}
