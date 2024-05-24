abstract class Car {

    void Feature() {
        System.out.println("Intence Method of car class");
    }

    abstract void color(); /* if you want to use any abstract method then must be class also Abstract otherwise they give compile time error. */

    abstract void model();

    final void AB(){
        // method implementation
    }

    static void ABB(){
        // method implementation
    }

    /* Abstract class not allow below final and static key with abstract keyword */

    // abstract final void Ab1();
    // abstract static void Ab2();

}

abstract class BMWCar extends Car {
    /* if you extend the abstract super class in Sub class then method always we
    want all method compalsary override in Sub class or another optin is decleare
    sub class is also abstract class then no need to ovverride all super classs
    method in sub class */

    public void color() {
        System.out.println("Method in side the sub class BMWCar 1");
    }

    // public void model() {
    //     System.out.println("Method in side the Sub class 2");
    // }
}

class BMWLatest extends BMWCar {

    public void model() {
        System.out.println("Method in side the Sub class BMWLatest 2");
    }
}

public class Abstract_Class {
   public static void main(String[] args) {
     /* In Abstract class we can not create the Object of class to access the member of class */
   
    /* To access the member of class we want create the refernce veriable of class */

    Car car = null; // reference veriable
    car = new BMWLatest();

    // if This methods pesent in super class then only they able to called only below methods
    car.Feature();
    car.color();
    car.model();
    
   }
}
