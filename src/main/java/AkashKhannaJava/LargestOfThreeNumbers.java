package AkashKhannaJava;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		int[] a= {2,34,45,67,123,45};
		int largest=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {
				largest=a[i];
			}
			
		}
		System.out.println(largest);
		
		
		

	}

}
