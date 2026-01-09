package AkashKhannaJava;

public class StringCompression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String comp=getCompressedString("aaabbccd");
		
		System.out.println(comp);

	}
	
	public static String getCompressedString(String name) {
		
		
		if (name == null || name.isEmpty()) {
		    return name;
		}

		
		StringBuilder compressed = new StringBuilder();
		
		int count=1;
		
		for(int i=1;i<name.length();i++) {
			
			if(name.charAt(i)==name.charAt(i-1)) {
				count++;
			}
			else {
				compressed.append(name.charAt(i-1));
				compressed.append(count);
				count=1;
			}
		}
		
		compressed.append(name.charAt(name.length()-1));
		compressed.append(count);
		
		return compressed.toString();
	}

}
