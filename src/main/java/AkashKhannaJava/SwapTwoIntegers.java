package AkashKhannaJava;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=74;
		int b=89;
		
		System.out.println("Before swapping "+a+" "+b);
		
		swapTwoIntegers(a, b);
	}
	
	public static void swapTwoIntegers(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping "+a+" "+b);
	}

}
