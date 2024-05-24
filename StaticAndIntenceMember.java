
class StaticAndIntenceMember {

    int id; // intence veriable because they mention without static keyword
    String Name = "Dipak"; // intence veriable

    static String Country = "india"; // static veriable

    {
        System.out.println("Hello Intence"); // intence block code
    }

    static {
        System.out.println("Hello Static"); // static block because they use staitic keyword before the block define
        // System.out.println(id); // here they not allow non-static veriable and also
        // to we want to decleare the value of id other they show error
    }

    StaticAndIntenceMember(int id) { // constuctor not have any return type if you give return type then that is
                                     // method not constuctor
        System.out.println("it is constuctor..");
    }

    void itIsIntenceMethod() { // Intence Method because it is without static keywords
        System.out.println("It is Intence Method....");
    }

    static void itIsStaticMethod() { // it is static method because we use Static keywords before the return of
                                     // method
        System.out.println("It is Static Method.....");
    }

}

class InnerStaticAndIntenceMember {
    public static void main(String[] args) {

        // StaticAndIntenceMember S1 = new StaticAndIntenceMember(0); // Object creation for StaticAndIntenceMember class to access the inside class member
 
        System.out.println(StaticAndIntenceMember.Country); // they do not allowcated another memory block for static method or veriable,
        // System.out.println(S1.Name); // for every obejct creation they create a new memory block for intence veriable or method.

        StaticAndIntenceMember S2 = new StaticAndIntenceMember(101);
        S2.itIsIntenceMethod(); // calling to the intence method using object reference
        StaticAndIntenceMember.itIsStaticMethod(); // calling to the static method direct using the class name of method
                                                   // and static method no need to create the object of class to calling
                                                   // the mehotd


    }
}