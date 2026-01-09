package AkashKhannaJava;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int num=9;
	boolean isPrime=true;
	
	if(num==0 || num==1) {
		System.out.println(num+" is not a prime number");
	}
	
	for(int i=2;i<=Math.sqrt(num);i++) {
		
		if(num%i==0) {
			isPrime=false;
			break;
		}
		
	}
	
	if(isPrime) {
		System.out.println(num+" is a prime number");
	}
	else {
		System.out.println(num+" is not a prime number");
	}
		
		
	}
}
