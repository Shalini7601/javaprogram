import java.util.ArrayList;
import java.util.List; 
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListUsingIteratorEx{ 

public static void main(String args[]) {
List<String> al = new ArrayList<String>();

al.add("Rose");
al.add("sunflower");
al.add("Lily");
al.add("Daisy");
al.add("Marigold");
al.add("Tulip");
al.add("Jasmine");

//System.out.println("Travering using for loop:");
//for(int i=0;i<al.size();i++) {
//System.out.println(al.get(i));
//}
//System.out.println("Travering using  for each loop:");
//for(String i : al) {
//System.out.println(i);
//}

//System.out.println("Travering using iterator:");
//Iterator itr = al.iterator();
//while(itr.hasNext()) {
//System.out.println(itr.next());
//}
System.out.println("Travering using list iterator - forword:");
ListIterator<String> it = al.ListIterator();
while(it.hasNext()) {
System.out.println(it.next());
}
System.out.println("Travering using list iterator - backword:");
ListIterator<String> it1 = al.ListIterator();
while(it1.hasPrevious()) {
System.out.println(it1.previous());
}

}
}





