package com;

public class Grossex {
public static void main(String args[]){
float basic_salary, basic_salary2, hra, hra1, hra2, hra3 = 0, Gross_salary, Gross_salary2;
double da,da1, da2, da3 = 0,Gross_salary1,Gross_salary3;

basic_salary=5000;
hra=500;
da=0.9;

basic_salary2=5000;
hra1=200;
da1=0.7;

da2 = (da * basic_salary) / 100;
hra2 = (hra * basic_salary) / 100;

Gross_salary = basic_salary + hra2;
Gross_salary1= basic_salary + da2;

System.out.println("Gross Salary HRA Emplyee:" +Gross_salary);
System.out.println("Gross Salary DA Employee :" +Gross_salary1);

da3 = (da1 * basic_salary2) / 100;
hra3 = (hra1 * basic_salary2) / 100;

Gross_salary2 = basic_salary + hra3;
Gross_salary3= basic_salary + da3;


System.out.println("Gross Salary HRA Emplyee :" +Gross_salary2);
System.out.println("Gross Salary DA Employee :" +Gross_salary3);

}
}








