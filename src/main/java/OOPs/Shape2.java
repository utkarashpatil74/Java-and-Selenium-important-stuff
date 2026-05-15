package OOPs;

 interface Shape2 {
	
	double calculateArea();
	
	

}

class Cir implements Shape2{
	double radius;
	
	private Cir(double radius) {
		System.out.println("This is a Cir constructor");
		this.radius=radius;
	}
	
	public double calculateArea() {
		return 3.14*radius*radius;
	}

class Rec extends Cir{
	double length;
	double breadth;
	
	public Rec(double length,double breadth, double radius) {
		super(radius);
		this.length=length;
		this.breadth=breadth;
		System.out.println("This is a Rec constructor");
		
	}
}
	
}