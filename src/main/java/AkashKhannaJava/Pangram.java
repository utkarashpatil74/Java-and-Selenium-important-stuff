package AkashKhannaJava;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the la dog".toLowerCase();
		
	
		
		Set<Character> chars=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				chars.add(s.charAt(i));
				
			}
		}
		
		if(chars.size()==26) {
			System.out.println(s+" is a Pangram");
		}
		else {
			System.out.println(s+" is not a Pangram");
		}
	}

}
