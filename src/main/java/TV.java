
abstract class TV {
	
	abstract void switchOn();
	
	abstract void switchOff();
	
	public void volumeUp() {
		System.out.println("Volume up from remote");
	}

}


class TVRemote extends TV{
	
	@Override
	public void switchOn() {
		System.out.println("Switched on from TVRemote");
	}
	
	@Override
	public void switchOff() {
		System.out.println("Switched off from TVRemote");
	}
}
