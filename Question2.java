package U4C1;

public class Question2 {
	
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails() {
		System.out.println(this.courseId);
		System.out.println(this.courseName);
		System.out.println(this.courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username == "Admin" && password == "1234") {
			Question2 Course = new Question2();
			Course.courseId = 3;
			Course.courseName = "java";
			Course.courseFee = 8;
//			System.out.println();
			Course.displayCourseDetails();
		}
			else {
				System.out.println("Invalid Username or password");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
