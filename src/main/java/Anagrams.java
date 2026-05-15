import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String a="silent";
		String b="listen";
		
		if(a.length()!=b.length()) {
			System.out.println("Two strings are not anagrams");
			return;
			
		}
		
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		
		
		if(Arrays.equals(c,d)) {
			System.out.println("Two strings are anagrams");
		}
		else {
			System.out.println("They are not anagrams");
		}
		
	}

}
