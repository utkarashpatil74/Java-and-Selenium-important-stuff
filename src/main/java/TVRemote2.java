
public class TVRemote2 extends TV{

	@Override
	public void switchOn() {
		System.out.println("Switched on from TVRemote");
	}
	
	@Override
	public void switchOff() {
		System.out.println("Switched off from TVRemote");
	}

}
