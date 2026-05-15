import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------HashMap-----------");
		
		HashMap<Integer,String> hmap=new HashMap<>();
		
		hmap.put(null,"Utkarsh");
		hmap.put(null,"Vaibhav");
		hmap.put(null,"Diwakar");
		hmap.put(1,"Diwakar");
		hmap.put(1, "Nalini");
		hmap.put(1,null);
		hmap.put(2, null);
		
		for(Map.Entry<Integer,String> entry:hmap.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		System.out.println("-----------Hashtable-----------");
		
	Map<Integer,String> ht=new Hashtable<>();
		
	
//		ht.put(null,"Utkarsh");
//		ht.put(null,"Vaibhav");
//		ht.put(null,"Diwakar");
		ht.put(1,null);
		ht.put(1, "Nalini");
		ht.put(1,"Bhagyashree");
		
		for(Map.Entry<Integer,String> entry:ht.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		

	}

}
