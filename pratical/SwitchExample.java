import java.util.Scanner;

class SwitchExample{
public void show(){
Scanner S = new Scanner(System.in);
System.out.println("Enter the ch");
char ch = S.next().charAt(0);
switch(ch){
case 'a':
System.out.println("Vowel");
break;
case 'e':
System.out.println("Vowel");
break;
case 'i':
System.out.println("Vowel");
break;
case 'o':
System.out.println("Vowel");
break;
case 'u':
System.out.println("Vowel");
break;
default:
System.out.println("Consonant");
}
}
public static void main(String args[]){
SwitchExample S = new SwitchExample();
S.show();
}
}