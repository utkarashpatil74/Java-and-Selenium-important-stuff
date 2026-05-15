package Pattern;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am Utkarsh Diwakar Patil$";
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==' ') {
				sb.append('$');
			}
			else if(s.charAt(i)=='$') {
				sb.append('.');
			}
			else {
				sb.append(s.charAt(i));
			}
			
		}
		
		System.out.println(sb);

	}

}
