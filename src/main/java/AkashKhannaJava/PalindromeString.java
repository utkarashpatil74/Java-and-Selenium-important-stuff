package AkashKhannaJava;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abbardrj";
		
		int start=0;
		int last=s.length()-1;
		boolean isPalindrome=true;
		while(start<last) {
			
			if(s.charAt(start)!=s.charAt(last)) {
				isPalindrome=false;
				break;
			}
			start++;
			last--;
		}
		
		if(isPalindrome) {
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome");
		}
		
	}

}
