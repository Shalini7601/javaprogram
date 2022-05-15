import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

public static void main(String args[]) {
LinkedList<String> a = new LinkedList<String>();
a.add("Ram");
a.add("Sam");
a.add("Ravi");
a.add("Priya");
a.add(0,"Rohini");
a.addFirst("Reshma");
a.add("Mohan");
a.add(2,"Moni");
a.addLast("Mani");



Iterator<String> itr = a.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
a.remove(3);
a.remove(1);
a.removeLast();

System.out.println("List after remove element:");
Iterator<String> itr1 = a.iterator();
while(itr1.hasNext()) {
System.out.println(itr1.next());
}
System.out.println("List in reverse oder:");
Iterator<String> itrr = a.descendingIterator();
while(itrr.hasNext()) {
System.out.println(itrr.next());
}
Iterator<String> itrr1 = a.ascendingIterator();
while(itrr1.hasNext()) {
System.out.println(itrr1.next());
}

}
}