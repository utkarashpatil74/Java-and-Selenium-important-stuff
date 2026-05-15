package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//16. Java program to extract the numerical values from the
		//string 'qw12er34ty567'
		//and print the output as 12+34+567=613
		
		String s="qw12er34ty567";
		
		
		
		Pattern pattern=Pattern.compile("(\\d+)");
		Matcher matcher=pattern.matcher(s);
		int sum=0;
		while(matcher.find()) {
			
			int x=Integer.valueOf(matcher.group(1));
			sum=sum+x;
			
		}
		
		System.out.println(sum);

	}

}
