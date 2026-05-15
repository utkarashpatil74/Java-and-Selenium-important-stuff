package Pattern;

public class ShiftingCharLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Output: 1234439887abc
		String s="a123b443c9887";
		
		StringBuilder digits=new StringBuilder();
		StringBuilder cha=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(Character.isDigit(c)) {
				digits.append(c);
			}
			else if(Character.isLetter(c)) {
				cha.append(c);
			}
				
		}
		
		System.out.print(digits+""+cha);
		
	}

}
