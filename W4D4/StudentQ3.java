package W4D4;

public class StudentQ3 {
	
	int roll;
	String name;
	String address;
	String collageName;
	boolean isFromNIT;
	
	public int getRoll() {
		return this.roll;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getCollageName() {
		return this.collageName;
	}
	
	public static StudentQ3 getStudentQ3(boolean isFromNIT) {
		if(isFromNIT == true) {
			StudentQ3 s1 = new StudentQ3();
			s1.roll = 4;
			s1.address = "Srirampura,Jakkur,Bangalore";
			s1.collageName = "NIT";
			return s1;
		}
		else {
			StudentQ3 s2 = new StudentQ3();
			s2.roll = 5;
			s2.address = "bangalore";
			s2.collageName = "notMaisai";
			return s2;
		}

	}

}
