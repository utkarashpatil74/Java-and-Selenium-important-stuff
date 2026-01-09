package AkashKhannaJava;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 1 2 3 5 8 13
		
		List<Integer> fib=new ArrayList<>();
		int a=0;
		int b=1;
		int temp=0;
		
		fib.add(a);
		fib.add(b);
	
		
		
		for(int i=0;i<9;i++) {
			
			temp=a+b; // 0 + 1=1
			fib.add(temp); //1
			
			a=b; //1
			b=temp;// a=1

		}
		
		System.out.println(fib);

	}

}
