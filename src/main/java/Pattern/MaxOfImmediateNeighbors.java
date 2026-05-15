package Pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxOfImmediateNeighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {15,4,3,2,8};
		
		List<Integer> ls=new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			
			if(i==0) {
				ls.add(a[i+1]);
			}
			else if(i==a.length-1) {
				ls.add(a[(a.length-1)-1]);
			}
			else {
				
				ls.add(Math.max(a[i-1],a[i+1]));
			}
		}
		
		System.out.println(ls);
		

	}

}
