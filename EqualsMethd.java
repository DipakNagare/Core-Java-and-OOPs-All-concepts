
class Student {
    int id;
    String Name;

    public Student(){
        System.out.println("Default constructer");
    }
    Student(int id, String Name){
        this.id = id;
        this.Name = Name;
    }

}

public class EqualsMethd {
    public static void main(String[] args) {
        Student S1 = new Student(20,"Dipak");
        Student S2 = new Student(20,"Dipak");

        // == operator check the reference of both objects
        System.out.println(S1 == S2);

        // equals() method also check the reference of both objects
        System.out.println(S1.equals(S2));

    }

    
}