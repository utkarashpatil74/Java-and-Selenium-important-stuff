package AkashKhannaJava;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=9;
		int temp=1;
		while(num!=0) {
			temp=temp*num;
			num--;
		}
		
		System.out.println(temp);

	}

}
