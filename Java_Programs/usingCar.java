//wap to create a class Car having fields model, color, make and methods start, stop.
class CarEx{
	String model;
	String colour;

	public void start(){
		System.out.println("Car is started");
	}

	public void stop(){
		System.out.println("Car is stopped");
	}
}

class usingCar{
	public static void main(String []args)
	{
		Car c1=new Car();
		c1.model="brezza";
		c1.colour="black";
		System.out.println("Model = " + c1.model);
		System.out.println("Colour = " + c1.colour);

		c1.start();
		c1.stop();
	}
}