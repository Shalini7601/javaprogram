package com;

import java.util.HashMap;

public class CMap {
	public static void main(String args[]) {
		CountryMap cm = new CountryMap();
		 cm.saveCountryCapital("India","Delhi");
		 cm.saveCountryCapital("Japan","Tokyo");
		 cm.saveCountryCapital("USA","Washington, D.C");
		 
		 System.out.println(cm.getCapital("India"));
		 System.out.println(cm.getCapital("Tokyo"));
		 System.out.println(cm.toArrayList());
		 
		 HashMap<String, String> M2 = cm.swapKyeValue();
		 System.out.println(M2);


	
		
	}

}
