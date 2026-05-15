
public class InterchangingTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Triangle".toLowerCase();
		
		String vowels="aeiou";
		
		char c[]=a.toCharArray();
		
		int start=0;
		int last=a.length()-1;
		
		while(start<last) {
			
			while(start<last && !vowels.contains(c[start]+"")) {
				start++;
			}
			
			while(start<last && !vowels.contains(c[last]+"")) {
				last--;
			}
			
			char temp=c[start];
			c[start]=c[last];
			c[last]=temp;
			
			start++;
			last--;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}
