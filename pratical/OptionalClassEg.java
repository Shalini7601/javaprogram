package javaBeg;
import java.util.Optional;

public class OptionalClassEg{

public static void main(String[]args){
//TODO auto-genersted method stub

String[]str=new String[5];
str[3]="anudip"; //value of index 3
Optional<String>c=Optional.ofNullable(str[3])
if(c.isPresent()){ //check for calue present
String l=str[3].toUpperCase();
System.out.println(l);
}
else{
System.out.println("Value not there");
}
}
}