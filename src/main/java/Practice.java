import java.util.HashSet;

public class Practice {

	public static String longestUniqueSubstring(String a) {
		
		int max=0;
		String output="";
		for(int i=0;i<a.length();i++) {
			
			HashSet<Character> unique=new HashSet<>();
			StringBuilder currentSubString=new StringBuilder();
			
			for(int j=i;j<a.length();j++) {
				
				char temp=a.charAt(j);
				
				if(unique.contains(temp)) {
					break;
				}
				else {
					unique.add(temp);
					currentSubString.append(temp);
				}
		
				
				
			}
			if(currentSubString.length()>max) {
				max=currentSubString.length();
				output=currentSubString.toString();
			}
		}
		return output;
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s= "Nalini";
		System.out.println(longestUniqueSubstring(s));

	}

}
