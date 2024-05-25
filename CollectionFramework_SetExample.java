import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.tree.TreeSelectionModel;

public class CollectionFramework_SetExample {
    public static void main(String[] args) {
        

        System.out.println("HashSet array......");
        HashSet hs = new HashSet();  // hashSet not allow duplicates and adding elements in hashset array we use the add() method.
        hs.add(123);
        hs.add("Its hash");
        hs.add(45);
        hs.add(123);

        System.out.println(hs);
        System.out.println(" \n");


        System.out.println("TreeSet array....");
        TreeSet ts = new TreeSet();  // in Tree Set array we only able to store the same type data not any other and adding elements in ThreeSet array we use the add() method.
        ts.add(233);
        // ts.add("dididi");
        // ts.add("pppp");
        ts.add(123);
        ts.add(565);

        System.out.println(ts);
        System.out.println(" \n");

        System.out.println("HashMap array....");

        HashMap hm = new HashMap<>();  // Hashmap store data in Key-value pair and they use to add data in hash map put method to add the elements inside the Hashmap and they store elements in { key:value } like this
        hm.put("id", 14);
        hm.put("Name", "Dipak");
        hm.put("SureName", "Nagare");

        System.out.println(hm);











    }
    
}
