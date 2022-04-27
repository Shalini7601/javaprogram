package Praticals;
class Manager extends employee{
public void Manageer(long id, String Name, String Address, long Phone,double basicSalary)
{
super(Id,Name,Address,Phone,basicSalary);
}

public void calculateTransportAllowance(){

double transportallowance = 15*basicSalary/100;

System.out.println("Transportallowance:"+transportallowance);
}
}

class Trainee extends Employee{
public Trainee(long id, String Name, String Address, long Phone, double basicSalary)
	{
		super(id, Name, Address, Phone, basicSalary);
		
	}

public void calculateTransportAllowance(){

double transportallowance = 10*basicSalary/100;

System.out.println("Transportallowance:"+transportallowance);
}
}


public class Inheritancectivity1 {
public static void main(String args[]){
Manager m=new Manager();
Trainee t=new Trainee();
m.calculateTransportAllowance();
t.calculateTransportAllowance();
}
}

