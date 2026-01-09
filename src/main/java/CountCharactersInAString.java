import java.util.HashMap;
import java.util.Map;

public class CountCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am a failed IT Professional";
		s=s.toUpperCase().replaceAll("[^A-Za-z]","");
		
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
		if(!hmap.containsKey(s.charAt(i))) {
			hmap.put(s.charAt(i), 1);
		}
		else {
			hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
		}
		}
		
		for(Map.Entry<Character,Integer> kv: hmap.entrySet()) {
			
			System.out.println(kv.getKey()+" "+kv.getValue());
		}
		
		

	}

}
