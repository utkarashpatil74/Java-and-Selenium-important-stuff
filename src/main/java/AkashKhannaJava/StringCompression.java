package AkashKhannaJava;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="aaaabbbccddddd";
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<a.length();i++) {
		
			
			if(hmap.containsKey(a.charAt(i))) {
				hmap.put(a.charAt(i), hmap.get(a.charAt(i))+1);
			}
			else {
				hmap.put(a.charAt(i),1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : hmap.entrySet()) {
			
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}
