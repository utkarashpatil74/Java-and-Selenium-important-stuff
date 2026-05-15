package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExpander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: a4b6c9
		//Output:aaaabbbbbbccccccccc
		
		String s="a4b6c9";
		
		Pattern pattern=Pattern.compile("([a-zA-Z])(\\d+)");
		Matcher matcher=pattern.matcher(s);
		
		StringBuilder sb=new StringBuilder();
		
		while(matcher.find()) {
			
			
				
				String x=matcher.group(1);
				int y=Integer.valueOf(matcher.group(2));
				
				for(int i=0;i<y;i++) {
					sb.append(x);
				}
			
			
		}
		System.out.println(sb.toString());
		
	}

}
