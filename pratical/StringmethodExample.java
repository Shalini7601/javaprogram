public class StringmethodExample{
public void show(){
String s="Anudip foundation skill development center";
String s1 = " ANUDIP ";
System.out.println("Upper Case is:" +s.toUpperCase());
System.out.println("Lower Case is:" +s.toLowerCase());
System.out.println(s1);
System.out.println("Trim is:" +s1.trim());
System.out.println("Startswith is:" +s.startsWith("Anu"));
System.out.println("Endswith is:" +s.endsWith("roh"));
System.out.println("CharAt is:" +s.charAt(3));
System.out.println("CharAt is:" +s.charAt(20));
System.out.println("length is:" +s.length());

int a = 20;
String s2 = String.valueOf(a);
System.out.println(s2);
System.out.println(s2 + 40);

System.out.println("Replace is:" +s.replace("foundation","Academi"));
}
public static void main(String args[]){
StringmethodExample o = new  StringmethodExample();
o.show();
}
}

