import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Misccc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> ls=new ArrayList<>();
		
		ls.add(12);
		ls.add(5);
		ls.add(2256);
		ls.add(10);
		ls.add(23);
		
		System.out.println("Original List "+ls);
		
		int limit=8;
		
		Iterator<Integer> it=ls.iterator();
		
		while(it.hasNext()) {
			int current=it.next();
			
			if(current>limit) {
				it.remove();
			}
			
		}
		
		System.out.println("Current list "+ls);
	

	}

}
