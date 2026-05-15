package Pattern;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,45,2,56,6,46,54};
		
		int max=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		if(a[0]>a[1]) { 
			
			max=a[0];
			secondLargest=a[1];
		}
		else if(a[1]>a[0]) {
			
			max=a[1]; //max =45
			secondLargest=a[0]; //2nd =12
		}
		
		for(int i=2;i<a.length;i++) {
			
			if(a[i]>max) {  //56 >45
				
				secondLargest=max; //45
				max=a[i]; //56
				
			}
			else if(a[i]>secondLargest) {
				secondLargest=a[i];
			}
			
			
		}
		
		System.out.println(secondLargest);
	}

}
