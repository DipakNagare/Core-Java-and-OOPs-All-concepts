public class StringClass {
    public static void main(String[] args) {

        // two to create the Object of String one is Using New keyword and another is
        // using without new keyword

        String S1 = new String("Dipak"); /*
                                          * they first in memory there is they already this object create in Sting
                                          * Constant pool if it is there then they create Object in HEAP directly but
                                          * obj is not already is there then they first create the obj inside the SCP
                                          * and then In HEAP
                                          */

        String Str = "Nagare"; // They check first obj is there already in SCP if it is there then they use that one other they create new obj inside the SCP.

        String S2 = "Dipak";

        String S3 = "Nagare";

        System.out.println(S1 == S2); // output is false because S1 obj is created using New keyword then they cretae two Obj one in SCP and One HEAP
        
        System.out.println(Str == S3); // they showing true beacuse both are created in SCP.

        System.out.println(S1.equals(S2)); // in string only Equals() method check the content of two obj otherwise they equals method check only reference of two obj.
    }

}
