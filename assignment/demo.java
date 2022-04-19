import java.util.Scanner;
class Encap{
private String name;
private int user_id;

public String get_name()
{
return name();
}
public int get_user_id()
{
return user_id();
}
}
public class Demo {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String name;
int u_id;
int i, ch, bal=50000, amount;
char ans;
do
{
System.out.println("Enter Choice:\n 1.Deposit \n 2.withdraw");
ch=sc.nextInt();
System.out.println("Enter the amount:");
amount=sc.nextInt();
switch(ch){
case 1:
bal=bal+amount;
break;
case 2:
bal=bal-amount;
break;
}
System.out.println("Do you want to do the process again");
ans=sc.next().charAt(0);
}while(ans=='y' || ans=='Y');
System.out.println("Final bal="+bal);

Encap obj=new Encap();
obj.set_name(name);
obj.set_user_id(u_id);

System.out.println("Name:" +obj.get_name());
System.out.println("User_id:" +obj.get_user_id());
}
}
