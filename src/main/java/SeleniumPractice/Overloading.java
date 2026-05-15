package SeleniumPractice;

public class Overloading {

	public String sum(int a, int b) {
		System.out.println("Sum of 2 numbers is "+(a+b));
		return "Vaibhav";
	}
	
	public String sum(int b, int a) {
		System.out.println("Sum of 3 numbers is "+(a+b));
		return "Utkarsh";
	}
	
	public void sum(double a, double b) {
		System.out.println("Sum of 2 double numbers is "+(a+b));
	}
	
	

}
