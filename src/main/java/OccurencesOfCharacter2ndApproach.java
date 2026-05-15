import java.util.ArrayList;
import java.util.List;

public class OccurencesOfCharacter2ndApproach {

    public static void main(String[] args) {
        
    	String c="I am working with optum pay".toLowerCase();
    	
    	char d[]=c.toCharArray();
    	
    	List<Character> ls=new ArrayList<>();
    	
    	for(int i=0;i<d.length;i++) {
    		
    		char x=d[i];
    		
    		if(x==' ' || ls.contains(x)) {
    			
    			continue;
    		}
    		
    		int count=0;
    		
    		for(int j=0;j<d.length;j++) {
    			
    			if(x==d[j]) {
    				count++;
    			}
    		}
    		ls.add(x);
    		System.out.println(x+" "+count);
    	}
    	
    	
    }
}
