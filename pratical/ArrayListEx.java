import java.util.ArrayList;
import java.util.List; 


public class ArrayListEx{ 

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

System.out.println(al);
System.out.println("Size of arraylist :" +al.size());

al.remove(5);

System.out.println(al);
System.out.println("Size of arraylist :" +al.size());

al.add("lovender");
al.add("Louts");
System.out.println(al);
System.out.println("Size of arraylist :" +al.size());
System.out.println("element of index value is :" +al.get(6));


}
}