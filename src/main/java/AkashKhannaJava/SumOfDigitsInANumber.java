package AkashKhannaJava;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123456789;
	
		int sum=0;
		while(num!=0) {
			
			int temp=num%10;
			
			sum=sum+temp;
			num=num/10;
		}
		
		System.out.println(sum);

	}

}
