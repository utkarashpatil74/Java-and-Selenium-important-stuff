import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;
		int temp1=1;
		int temp2;
		
		
		List<Integer> ar=new ArrayList<>();
		
		ar.add(temp);
		ar.add(temp1);
		
		for(int i=0;i<9;i++) {
			
			temp2=temp+temp1;
			
			ar.add(temp2);
			temp=temp1;
			temp1=temp2;
		}
		
		System.out.println(ar);

	}

}
