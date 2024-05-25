import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Hello {
   public void S(){
    System.out.println("they not access show side elemts of this method in arraylist");
   }    
}

public class CollectionFramework_ListExample {
    public static void main(String[] args) {
        
        ArrayList AL = new ArrayList();  // in Array we able to store only same type of data but in ArrayList we able to store all type of data in one array means it is Dynamic in nature.
        AL.add(123);
        AL.add("Hey");
        AL.add(new Hello()); // they also able to store another class and to convert into that class in tostring
        System.out.println(AL);

        // Iterate or access the elements in the arraylist collection provide or use  itratore interface and also using this interface we able to access List and Set elements.

        Iterator itr = AL.iterator(); // in Iterator only we able to print elements by forward direction 

        while(itr.hasNext()) { // this hasNext() method check first any element present in arraylist if it is there then they return the true another wise they return false.
            System.out.println(itr.next()); // next() method show elements one bye one horizontally
        } 

       

        System.out.println("ListIterator......\n");  //Listiterator implements the Iterator

        ListIterator ListItr = AL.listIterator();

        System.out.println("ListIerator in forward direction.........");
        while (ListItr.hasNext()) {
            System.out.println(ListItr.next());
        }

        System.out.println("\n");

        System.out.println("ListIerator in Backword direction.........");
        while (ListItr.hasPrevious()) {
            System.out.println(ListItr.previous());
        }

    }
    
}
