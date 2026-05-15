import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Geeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12. Write a code to print a12b7c5. output - aaaaaaaaaaaabbbbbbbccccc
	
		String s="a12b7c5";
		Pattern pattern=Pattern.compile("([A-Za-z])(\\d+)");
		Matcher matcher=pattern.matcher(s);
		
		StringBuilder sb=new StringBuilder();
		
		while(matcher.find()) {
			String ch=matcher.group(1);
			int x=Integer.parseInt(matcher.group(2));
			
			for(int i=0;i<x;i++) {
				sb.append(ch);
			}
			
			
		}
		
		System.out.println(sb.toString());
		
		
	
	
	}

}
