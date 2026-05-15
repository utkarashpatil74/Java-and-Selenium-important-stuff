import java.util.ArrayList;
import java.util.List;

public class GetIndexOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[]={1,23,45,6,78,4,98,98,23,45,98};
	        int num=98;
	        boolean flag=false;
	        
	     	List<Integer> ls=new ArrayList<>();
	        for(int i=0;i<arr.length;i++) {
	       
	    
	        	if(num==arr[i]) {
	        		ls.add(i);
	        
	        	}
	        
	        
	        }
	        
	        System.out.println("Index of "+num+" is "+ls.toString());

	}

}
