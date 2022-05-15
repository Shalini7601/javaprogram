import java.util.ArrayList;
import java.util.List; 
import java.util.Collections;


public class ArrayListusingSortedEx{ 

public static void main(String args[]) {
List<String> al = new ArrayList<String>();

al.add("Rose");
al.add("sunflower");
al.add("Rose");
al.add(0,"Lily");
al.add(2,"Daisy");
al.add("Marigold");
al.add(6,"Tulip");
al.add("Jasmine");
al.add("Orchid");
al.add(5,"Lovender");

System.out.println("String sorted List:");
Collections.sort(al);
for(String a : al) {
System.out.println(a);
}
List<Integer> al1 = new ArrayList<Integer>();
al1.add(20);
al1.add(60);
al1.add(20);
al1.add(10);
al1.add(67);
al1.add(98);
al1.add(5);
al1.add(96);

System.out.println("Intger sorted List:");

Collections.sort(al1);
for(Integer i : al1){
System.out.println(i);
}
Collections.reverse(al1);
System.out.println(al1);
}
}