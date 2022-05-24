public class StringObjEx {

public static void main(String args[]) {

String obj1 = "Stephen Edwin King";
String obj2 = "Walter winchell";
String obj3 = "RohiniResham";

boolean equals1 = obj1.equals(obj2);
boolean equals2 = obj1.equals(obj1);

int result = obj1.compareToIgnoreCase(obj2);
//int result = obj1.compareToIgnoreCase(obj3);

System.out.println("\""+ obj1 +"\" equals\"" + obj2 +"\"?" + equals1);
System.out.println("\""+ obj1 +"\" equals\"" + obj1 +"\"?" + equals2);
}
}