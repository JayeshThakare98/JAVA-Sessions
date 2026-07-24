package overrirdingConcept;

public class BmwCar extends Car {

	void enginePower() {
		System.out.println("BMW have the HorsePower Engine");
	}
	@Override
	void drive() {
		System.out.println("We are racing a car");
	}
	
}
