package W4D4;

public class Demo {
	
	String s;
	int i;
	float f;
	

	public Demo() {
//		System.out.println("inside demo1");
	}
	
	public Demo(String s) {
		this();
		this.s = s;
		System.out.println("inside demo2 s");
	}
	
	public Demo(int i) {
		this("string");
		this.i = i;
		System.out.println("inside demo3 i ");
	}
	public Demo (float f) {
		
		this.f = f;
		System.out.println("inside demo4 f");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo("testname");
		
	}

}
