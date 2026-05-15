
public class Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//11. Convert a1b2c3 into abc123.
		
		String s="a1b2c3";
		StringBuilder letter=new StringBuilder();
		StringBuilder digit=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			
			if(Character.isDigit(c)) {
				digit.append(c);
			}
			else if(Character.isLetter(c)) {
				letter.append(c);
			}
		}
		
		System.out.println(letter+""+digit);
	}

}
