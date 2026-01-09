package AkashKhannaJava;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntegerToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=560;
		List<Integer> arr=new ArrayList<>();
		while(num!=0) {
			
			int temp=num%8;
			arr.add(temp);
			num=num/8;
			
		}
		
		for(int i=arr.size()-1;i>=0;i--) {
			System.out.print(arr.get(i));
		}
		

	}

}
