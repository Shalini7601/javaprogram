package com;

import java.util.Scanner;
public class CV {
	public void Mcheck(int age, boolean Indian) throws VaccineElagegbilityException {

	try {
		if(age>=60) {
			if(Indian = true) {
				System.out.println("Eligible for Vaccination");
		
			}
		} else { 
		throw new VaccineElagegbilityException ("Not Eligible for Vaccination");
		}
		
		} catch(Exception e) {
			System.out.println(e);
	}
}
	
	public void Fcheck(int age, boolean Indian) throws  VaccineElagegbilityException {
		try {
			if(age>50) {
				if(Indian = true) {
					System.out.println("Eligible for Vaccination");
				}
			}else { 
				throw new  VaccineElagegbilityException ("Not Eligible for Vaccination");
			}
			}catch (Exception e) {
				System.out.println(e);
		}
	}
	public static void main(String args[]) throws  VaccineElagegbilityException {
		CV c= new CV();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("------------Covid Vaccination System-----------");
			System.out.println("1. Male \n 2. Female \n 3. Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 :
				System.out.println("Enter Your age");
				int ag = sc.nextInt();
				System.out.println("Are yor Indian? : if yes say 'true'");
				boolean na = sc.nextBoolean();
				c.Mcheck(ag, na);
				break;
				
			case 2:
				System.out.println("Enter your age:");
				int ag1 = sc.nextInt();
				System.out.println("Are yor Indian? : if yes say 'true'");
				boolean na1 = sc.nextBoolean();
				c.Fcheck(ag1,  na1);;
				break;
				
			case 3:
				System.out.println("Thank You ");
				System.exit(0);
				break;
				
						
			}
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
