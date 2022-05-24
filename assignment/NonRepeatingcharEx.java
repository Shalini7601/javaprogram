public class NonRepeatingcharEx {

public static void main(String args[]) {
String st = "gibblegabbler";

for(char i:st.toCharArray()){
if(st.indexOf(i)==st.lastIndexOf(i)) {
System.out.println("Non-Repeating character is:" +i);
break;

}
}
}
}