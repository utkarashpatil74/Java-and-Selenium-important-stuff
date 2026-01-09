
public class InterchangingTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Triangle".toLowerCase();
		
		String vowels="aeiou";
		
		char b[]=a.toCharArray();
		
		int start=0;
		int end=a.length()-1;
		
		while(start<end) {
			
			while(start<end && !vowels.contains(b[start]+"")) {
				start++;
			}
			while(start<end && !vowels.contains(b[end]+""))
			{
				end--;
			}
			
			char temp=b[start];
			b[start]=b[end];
			b[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.println(new String(b));

	}

}
