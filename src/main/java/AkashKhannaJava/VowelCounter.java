package AkashKhannaJava;

import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Utkarsh Diwakar Patil".toLowerCase();
		
		String vowel=s.replaceAll("[^aeiou]","");
		
		

		int vowelCount=0;
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		
		for(int i=0;i<vowel.length();i++) {
			
			
			
			if(hmap.containsKey(vowel.charAt(i))) {
				hmap.put(vowel.charAt(i),hmap.get(vowel.charAt(i))+1);
			}
			else {
				hmap.put(vowel.charAt(i),1);
			}
			
		}
		
		
		System.out.println(hmap);

	}

}
