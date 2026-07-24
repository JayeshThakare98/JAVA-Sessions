package overrirdingConcept;

public class Main {
	public static void main(String[] args) {
		// obj for Parent 
		Car car = new Car() ; 
		System.out.println("This is Car object");
		car.drive();
		
		// childe class object
		System.out.println("This is BMWCar Object");
		BmwCar bmwCar = new BmwCar() ; 
		bmwCar.enginePower(); // 
		bmwCar.drive(); // 
		
		// Nano Object 
		System.out.println("This is from Nano");
		Nano nano = new Nano() ; 
		nano.drive();
}
}
