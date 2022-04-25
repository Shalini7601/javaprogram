import java.util.*;
public class StringExample{
public void show(){
char [] arr = {'j','a','v','a'};
String s = new String (arr); //convert ch array to string
System.out.println("Value is:" +s);
System.out.println(arr);
}
public void myFunction(){
String m = "Rohini"; // string literal
String m1 = "Rohini S";
String m3 =  "bts v";
String m4 = "Rohini";
String m2 = new String("Rohini"); //string new keyword
System.out.println(m.equals(m1)); //false
System.out.println(m.equalsIgnoreCase(m2));//true
System.out.println(m2.equals(m));//false
System.out.println(m == m2);
System.out.println(m4==m1);
System.out.println(m3.compareTo(m1));
System.out.println(m1.compareTo(m4));
System.out.println(m.compareTo(m3));
}
public void display(){
String s= "Anudip" + "Foundation";
System.out.println(s);
String s1 = 80+"Rohini" +20;
String s2 = 80+ +40+"Rohini" +20 +30;
System.out.println(s1);
System.out.println(s.concat(s1));
System.out.println(s.concat(s2));
}

public static void main(String args[]){
StringExample obj = new StringExample();
obj.show();
obj.myFunction();
obj.display();
}
}