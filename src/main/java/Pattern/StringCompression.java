package Pattern;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Output: a4b6c9
		//Input:aaaabbbbbbccccccccc
		
		String s="aaaabbbbbbccccccccc";
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(hmap.containsKey(s.charAt(i))) {
				
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}else {
				hmap.put(s.charAt(i),1);
			}
			
	
			
		}
		
	for(Map.Entry<Character,Integer> v:hmap.entrySet()) {
			
			System.out.print(v.getKey()+""+v.getValue());
		}
	}

}
