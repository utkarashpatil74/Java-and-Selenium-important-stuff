package AkashKhannaJava;

public class CountEvenAndOddDigitsWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=123456789;
		int temp;
		int evenCount=0;
		int oddCount=0;
		while(number!=0) {
			temp=number%10;
			
			if(temp%2==0) {
				evenCount++;
			}
			else if(temp%2!=0) {
				oddCount++;
			}
			number=number/10;
			
		}
		
		System.out.println("Even count "+evenCount);
		System.out.println("Odd count "+oddCount);
		
	
		
		

	}

}
