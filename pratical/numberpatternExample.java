import java.util.Scanner;
class numberpatternExample{
public void num(){
Scanner sc = new Scanner(System.in);
System.out.println("How many rows");
int rows = sc.nextInt();
System.out.println("Your Patter");
for( int i = 1; i<= rows; i++){
for( int j = 1; j <= i; j++){
System.out.print(j+"");
}
System.out.println();
}
for( int i = rows-1;i >= 1; i--){
for( int j = 1; j <= i; j++){
System.out.print(j+"");
}
System.out.println();
}
}
public static void main(String args[]){
numberpatternExample obj = new numberpatternExample();
obj.num();
}
}