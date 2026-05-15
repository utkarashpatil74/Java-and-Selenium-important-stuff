import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 1 1 2 3 5 8
		
		int temp=0;
		int temp1=1;
		
		List<Integer> ls=new ArrayList<>();
		ls.add(0);
		ls.add(1);
		
		
		for(int i=0;i<9;i++) {
		 int temp3=temp+temp1;
		 ls.add(temp3);
		 temp=temp1;
		 temp1=temp3;
		}
		
		System.out.println(ls);
	}

}
