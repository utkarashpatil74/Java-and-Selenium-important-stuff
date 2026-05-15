import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Utkarsh Diwakar Patil".toLowerCase();
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(hmap.containsKey(s.charAt(i))) {
				
				hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
			}
			else {
				hmap.put(s.charAt(i),1);
			}
		}
		
		
		for(Map.Entry<Character,Integer> k: hmap.entrySet()) {
			
			if(k.getValue()==1) {
				System.out.println(k.getKey()+" "+k.getValue());
			}
		}
		

	}

}
