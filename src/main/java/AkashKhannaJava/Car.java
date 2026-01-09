package AkashKhannaJava;

public class Car {
	
	
	String name;
	int price;
	public static final int  wheels=4;
	int seatingCapacity;
	double mileage;
	
	public Car(String name,int price){
		
		this.name=name;
		this.price=price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car("BMW", 1234567890);
		System.out.println(c.name+" "+c.price+" "+wheels+" "+c.mileage+" "+c.seatingCapacity);
		c.mileage=4.8;
		System.out.println(c.name+" "+c.price+" "+wheels+" "+c.mileage+" "+c.seatingCapacity);
		c.seatingCapacity=7;
		System.out.println(c.name+" "+c.price+" "+wheels+" "+c.mileage+" "+c.seatingCapacity);
		
		
		
	}

}
