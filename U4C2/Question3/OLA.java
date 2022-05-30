package Question3;

public class OLA {

	public Car bookCar(int numberOfPassengers, int numberOfKms) {
		if(numberOfPassengers <= 3) {
			Car h1 = new Hatchback();
			return h1;
		}
		else {
			Car s1 = new Sedan();
			return s1;
		}
	}
	
	public void calculateBill(Car car) {
		System.out.println(car);
	}
}
