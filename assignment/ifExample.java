import java.util.Scanner;
class ifExample{

public void show(){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the marks:");
double marks = Sc.nextDouble();

if(marks >= 35 && marks < 45){
System.out.println("D grade");
}
else if(marks >= 45 && marks < 55){
System.out.println("C grade");
}
else if(marks >= 60 && marks < 75){
System.out.println("B grade");
}
else if(marks >= 75 && marks < 85){
System.out.println("A grade");
}
else if(marks >= 85 && marks < 100){
System.out.println("O grade");
}

else{
System.out.println("Fail / Absent");
}
}
public static void main(String args[]){
ifExample e = new ifExample();
e.show();
}
}
