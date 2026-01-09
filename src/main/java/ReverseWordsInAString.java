
public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="This is a method";
		
		String a[]= s.split(" ");
		String c="";
		
		for(int i=0;i<a.length;i++) {
			
			String b=a[i];
			
			for(int j=b.length()-1;j>=0;j--) {
				
				c+=b.charAt(j);
		
				
			}
		
			c=c+" ";
			
		}
		System.out.println(c);
		
	

	}

}
