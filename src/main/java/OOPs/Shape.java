package OOPs;

abstract class Shape {
	
	String color;
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		
		System.out.println("Shape constructor is called");
		this.color=color;
		
	}
	public String getColor() {
		
		return color;
	}
	
}
	
	class Circle extends Shape{
		
		double radius;
		
		public Circle(double radius, String color) {
			super(color);
			System.out.println("Circle constructor is called");
			this.radius=radius;
		}

		@Override
		double area() {
			double a=3.14*radius*radius;
			return a;
		}

		@Override
		public String toString() {
			System.out.println("This is from circle class and color is "+super.getColor());
			return	String.valueOf(area());
			
		}
		
	}
	
	class Rectangle extends Shape{
		
		double length;
		double width;
		
		public Rectangle(double length,double width,String color) {
			super(color);
			this.length=length;
			this.width=width;
			System.out.println("This is a Rectangle constructor");
		}
		
		
		public double area() {
			double a=length*width;
			return a;
		}
		
		public String toString() {
			System.out.println("This is from rectangle class and color is "+super.getColor());
			return String.valueOf(area());
		}
		
		
	}
	


