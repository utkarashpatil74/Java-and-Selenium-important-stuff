
public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Utkarsh Diwakar Patil".toLowerCase();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
					||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				continue;
				
			}
			
			sb.append(s.charAt(i));
		}
		
		System.out.println(sb.toString());
		

	}

}
