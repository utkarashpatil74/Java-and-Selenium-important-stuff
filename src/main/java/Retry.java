
public class Retry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int count=0;
	int maxRetry=3;
	public static boolean Retry(IRetryAnalyzer retryAnalyzer) {
		
		if(!retryAnalyzer.Success) {
			
			if(count<maxRetry) {
				
				count++;
				
				retryAnalyzer.setStatus(IRetryAnalyzer.Failure);
				return true;
			}else {
				retryAnalyzer.setStatus(IRetryAnalyzer.FAILURE);
				
			}
			
		}
		else {
			retryAnalyzer.setStatus(IRetryAnalyzer.FAILURE);
		}
		
		return false;
	}

}
