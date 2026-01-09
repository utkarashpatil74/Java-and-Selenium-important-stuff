package AkashKhannaJava;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="  Akash   Khanna  ";
		
		for(int i=0;i<s.length();i++) {
			
			if(!(s.charAt(i)==' ')) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
