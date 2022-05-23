package W4D4;

public class Student {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
		
	}
	
	public Student (int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age>18 && age<60) {
		this.age=age;
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setMarks(int marks){
		this.marks= marks;
	}
	public int getMarks(){
		return marks;
	}

}
