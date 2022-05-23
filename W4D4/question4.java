package W4D4;

public class question4 {

	public void oddOrEven(int num) {
		if(num<0) {
			System.out.println("error");
		}
		else if(num%2==1) {
			System.out.println(num);
		}
		else{
			int temp = ((num/10) * 10);
			int tempHigher = temp+10;
			if(num-temp>tempHigher-num) {
				System.out.println(temp);
			}
			else
				System.out.println(tempHigher);
		}
	}
	
	public static void main(String args[]) {
		question4 number = new question4();
		number.oddOrEven(-34);
	}

}
