import java.util.Scanner;
 
class IfElseIfExample{

public void show(){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the num:");
int num = Sc.nextInt();

if(num <10){
System.out.println("Your num is very less");
}
else if(num <=10){
System.out.println("Your num is middle");
}
else{
System.out.println("Your num is large");
}
}
public static void main(String args[]){
IfElseIfExample e = new IfElseIfExample();
e.show();
}
}