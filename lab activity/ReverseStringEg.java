import java.util.Scanner;

class ReverseStringEg {
public static void main(String args[]) {

System.out.println("Enter the Reverse String:");

Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

StringBuilder sb = new StringBuilder();

for(int i = s.length()-1; i>=0; i--) {
reverse=reverse + s.charAt(i);
}

System.out.println("Reversed String is:");
System.out.println(reverse);
}
}