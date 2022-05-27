public class TaxCalculator1{
	String empName;
	boolean isIndian;
	double empSal;
	double taxAmount;
	public TaxCalculator1(String empName, boolean isIndian, double empSal) {
	this.empName = empName;
	this.isIndian = isIndian;
	this.empSal = empSal;
	}
	public double calculateTax() throws Exception {
	if (isIndian==false) {
	throw new CountryNotValidException(isIndian);
	}
	if (empName==null) {
	throw new EmployeeNameInvalidException(empName);
	}
	if (empSal>100000) {
	taxAmount = empSal*8/100;
	}
	if (empSal>50000&&empSal<100000&&isIndian==true) {
	taxAmount = empSal*6/100;	
	}
	if (empSal>30000&&empSal<50000&&isIndian==true) {
	taxAmount = empSal*5/100;	
	}
	if (empSal>30000&&empSal<50000&&isIndian==true) {
	taxAmount = empSal*4/100;
	}
	else {
	class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(){
	super();
	}
	}
	}
	return taxAmount;
	}
	}
public class CountryNotValidException extends Exception {
public CountryNotValidException(boolean isIndian) {
super();	
}
}
