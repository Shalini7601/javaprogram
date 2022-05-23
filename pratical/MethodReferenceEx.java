@FunctionalInterface 
interface Sample {

void display(String a);
}

public class MethodReferenceEx {
public void display(String a){
System.out.println("Hello.. I am " +a);
}

public static void main(String args[]) {

MethodReferenceEx m = new MethodReferenceEx();
Sample s = m::display;
s.display("Rohini");
}
}