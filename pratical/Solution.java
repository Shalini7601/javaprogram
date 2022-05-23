import java.util.Scanner;

class UsernameValidator {

public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";

}

public class Solution {

private static final Scanner sc = new Scanner(System.in);

public static void main(String args[]) {
int n = Integer.parseInt(sc.nextLine());

while(n-- !=0){
String userName = sc.nextLine();

if(userName.matches(UsernameValidator.regularExpression)) {
System.out.println("Valid");
} else {
System.out.println("Invalid");
}
}
}
} 