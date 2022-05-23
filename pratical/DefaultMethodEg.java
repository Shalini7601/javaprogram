package javaBeg;

public class DefaultMethodEg implements Sample{

public static void main(String[]args){
//TODO Auto-generated method atub
DefaultMethodEg d=new DefaultMethodEg();
d.display("Good Morning"); //calling abstract method
d.display(); //calling default method
sample.my(); //calling static method
}

@Override
public void display(String a){
//TODO Auto-generated method stub
System.out.println(a);
}
}