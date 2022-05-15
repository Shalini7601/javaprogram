import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Bank {
long accountNo;
String customName;
double balance;
int customAge;

public Bank(long accountNo,String customName,double balance,int customAge) {
super();
this.accountNo = accountNo;
this.customName = customName;
this.balance = balance;
this.customAge = customAge;
}
}
class BankEx {
public static void main(String args[]){

Bank b = new Bank(12345,"Rohini",5000.78,20);
Bank b1 = new Bank(12346,"V", 7600.73,34);
Bank b2 = new Bank(12347,"JK",5400.98,32);
Bank b3 = new Bank(12348,"JIN",8900.99,54);
Bank b4 = new Bank(12349,"JIM",9900.34,48);
Bank b5 = new Bank(12350,"RM",95000.78,55);

ArrayList<Bank> al = new ArrayList<>();
al.add(b);
al.add(b5);
al.add(b3);
al.add(b1);
al.add(b4);
al.add(b2);

Iterator itr = al.iterator();
while(itr.hasNext()) {
Bank obj = (Bank) itr.next();
System.out.println(obj.accountNo +" " +obj.customName + " "+ obj.balance + " "+ obj.customAge);
}
al.remove(b);
System.out.println("After removing string:");
Iterator itr1 = al.iterator();
while(itr1.hasNext()) {
Bank obj = (Bank) itr1.next();
System.out.println(obj.accountNo +" " +obj.customName + " "+ obj.balance + " "+ obj.customAge);
}
}
}

