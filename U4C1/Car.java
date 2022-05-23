package U4C1;

public class Car {
	
	private String model;
	private String companyName;
	private String Color;
	
	
	public Car() {
		
	}
	
//	public Car(String model, String compnayName, String Color) {
//		
//	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setColor(String Color) {
		this.Color = Color;
	}
	
	public String getColor() {
		return Color;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine();
		engine.setRpm(10000);
		engine.setPower(110);
		engine.setManufacturer("Tata");
		engine.setHasTurbo(true);
		System.out.println(engine.getManufacturer());
	}

}
