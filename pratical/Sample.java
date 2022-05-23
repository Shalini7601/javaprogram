package java8eg;

@FunctionalInterface
public interface Sample{

void display(String a);//abstract method

default void display1(){ //default method
System.out.println("i am default method");
}

static void my(){
System.out.println(" iam static method");
}
//void abc();
}
