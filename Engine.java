package U4C1;

public class Engine {
	
	
	private int rpm;
	private int power;
	private String manufacturer;
	private Boolean hasTurbo;
	
	Engine(){
		
	}
	
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	public int getRpm() {
		return rpm;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setHasTurbo(Boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	
	public Boolean getHasTurbo() {
		return hasTurbo;
	}
	
	public void MakeItTurbocharged() {
		this.hasTurbo = true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
