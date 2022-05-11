import java.io.Console;
public class ConsoleClassEx {
public static void main(String args[]) {
Console c = System.console();
System.out.println("Enter the name:");
String n = c.readLine();
System.out.println("Welcome" + n);
System.out.println("Enter the password");
char [] ch = c.readPassword();
String p = String.valueOf(ch);
System.out.println("Password is :" +p);
}
}