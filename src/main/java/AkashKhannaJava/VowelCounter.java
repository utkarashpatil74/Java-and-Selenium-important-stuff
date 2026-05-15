package AkashKhannaJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Utkarsh Diwakar Patil".toLowerCase();
		
		a=a.replaceAll("[^aeiou]","");
		
		char b[]=a.toCharArray();
		
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<b.length;i++) {
			
			if(hmap.containsKey(b[i])) {
			hmap.put(b[i],hmap.get(b[i])+1);
			}
			else {
				hmap.put(b[i],1);
			}
		}
		
		for(Entry<Character,Integer> k:hmap.entrySet()) {
			System.out.println(k.getKey()+" "+k.getValue());
		}

	}

}
