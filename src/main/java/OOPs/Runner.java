package OOPs;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle(6,"blue");
		System.out.println(c.area());
		System.out.println(c.toString());
		
		
		Rectangle r=new Rectangle(8, 6.9, "Red");
		System.out.println(r.area());
		System.out.println(r.toString());

	}

}
