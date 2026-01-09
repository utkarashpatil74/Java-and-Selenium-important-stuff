
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="a1b2c3";
		//6
		int b=1;
		a=a.replaceAll("[^0-9]","");
		
		System.out.println(a);
		
		for(int i=0;i<a.length();i++) {
			b=b*Character.getNumericValue(a.charAt(i));
			
		}
		
		System.out.println(b);

	}

}
