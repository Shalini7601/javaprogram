package com;


class MyCutomException extends Exception {
	
}

public class CustomException {
	public static void main(String args[]) {
		try {
			throw new MyCutomException();
		}
		catch(MyCutomException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Finally Block");
			System.out.println("No Exception: finally block executed");
		}
		
		System.out.println("rest of the code");
	}

}
