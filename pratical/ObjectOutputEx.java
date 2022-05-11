import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Student implements Serializable{

int id;
String sname;
transient int fees;

public Student(int id, String sname, int fees){

this.id = id;
this.sname = sname;
this.fees = fees;
}
}

public class ObjectOutputEx {
public static void main(String args[]) {
try{
Student s = new Student(101,"Rohini", 2000);
FileOutputStream fout = new FileOutputStream("D://ab.txt");
ObjectOutputStream obj =new ObjectOutputStream(fout);
obj.writeObject("done");
}catch(Exception e) {
System.out.println(e);
}
}
}
class ObjectInputEx {
public static void main(String args[]) {
try{
ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D://ab.txt"));
Student s = (Student) oi.readObject();

System.out.println("id is: " +s.id +"Nmae is :" +s.sname +"fees is: " +s.fees);
oi.close();
}catch(Exception e) {
System.out.println(e);
}
}
} 

