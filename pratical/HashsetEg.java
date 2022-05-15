import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashsetEg {
public static void main(String args[]) {

Set<String> s = new HashSet<String>();
s.add("Pen");
s.add("Pencil");
s.add("Mouse");
s.add("Phone");
s.add("null");
s.add("Ac");
s.add("Bottle");
s.add("earphone");
s.add("null");
s.add("Pen");

Iterator<String> itr = s.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

s.remove("Ac");
System.out.println(s);
}
}