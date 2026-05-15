import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Never ever give up ".toLowerCase();
		
		List<Character> v=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			
			if(!(s.charAt(i)==' ')) {
				v.add(s.charAt(i));
			}
		}
		char c[]=s.toCharArray();
		
		
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<v.size();i++) {
			
			if(hmap.containsKey(v.get(i))) {
				hmap.put(v.get(i), hmap.get(v.get(i))+1);
			}
			else {
				hmap.put(v.get(i),1);
			}
		}
		
		for(Map.Entry<Character,Integer> it:hmap.entrySet()) {
			
			System.out.println(it.getKey()+" "+it.getValue());
		}

	}

}
