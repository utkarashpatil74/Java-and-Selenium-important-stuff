import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="xctesh";
		String t="aesvct";
		
		
		if(s.length()!=t.length()) {
			System.out.println("Two strings are not anagrams");
		}
		else {
			
			char b[]=s.toCharArray();
			char c[]=t.toCharArray();
			
			Arrays.sort(b);
			Arrays.sort(c);
			
			if(Arrays.equals(b,c)) {
				System.out.println("Two Strings are anagrams");
			}
			else {
				System.out.println("They are not anagrams");
			}
		}

	}

}
