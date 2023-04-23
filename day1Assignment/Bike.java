package week1.day1Assignment;

public class Bike {

	public void applyBrakebike()
	{
		System.out.println("Applied Brake Bike");
	}
	public void soundHornbike()
	{
		System.out.println("Sound Horn Bike");
	}
	public static void main(String[] args) {
		Car objCar=new Car();
		Bike objBike=new Bike();
		objCar.applyBrake();
		objCar.soundHorn();
		objBike.applyBrakebike();
		objBike.soundHornbike();
				
		

	}

}
