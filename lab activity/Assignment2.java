package com;

public class Assignment2 {
	
	public static void main(String args[]) {
		Country c = new Country();
		
		c.saveCountryNames("India");
		c.saveCountryNames("USA");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("Bangladesh");
		c.saveCountryNames("China");
		
		System.out.println("China:" +c.getCountry("China"));
		System.out.println("Japan:" +c.getCountry("Japan"));
	}

}
 