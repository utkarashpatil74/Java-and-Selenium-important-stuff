import java.util.HashMap;
import java.util.Map;

public class CountWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am an IT Engineer an Ancesstor Utkarsh Utkarsh Vaibhav";
		
		String[] s1=s.split(" ");
		
		int count=0;
		
		Map<String,Integer> hmap=new HashMap<>();
		
		
		
		for(int i=0;i<s1.length;i++) {
			
			if(hmap.containsKey(s1[i])) {
				hmap.put(s1[i],hmap.get(s1[i])+1);
			}
			else{
				
				hmap.put(s1[i],1);
			}
		}
	
	
	for(Map.Entry<String,Integer> entry: hmap.entrySet()) {
		
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	}
}
			
		

	


