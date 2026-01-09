package AkashKhannaJava;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number="123456789";
		int evenCount=0;
		int oddCount=0;
		
		
		for(int i=0;i<number.length();i++) {
			
			int num=(int)number.charAt(i);
			
			if(num%2==0) {
				evenCount++;
			}
			else if(num%2!=0) {
				oddCount++;
			}
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
