import java.util.Scanner;

class IfElseExample{
public void display(){
Scanner Sc = new Scanner(System.in);
System.out.println("Enter your num:");
int num= Sc.nextInt();
if(num%2==0){
System.out.println("Your num is EVEN");
}
else{
System.out.println("Your num is ODD");
}
}
public static void main(String areg[]){
IfElseExample obj = new IfElseExample();
obj.display();
}
}