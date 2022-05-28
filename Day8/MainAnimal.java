package Day8;

public class MainAnimal {

	public static void main(String[] args){
		Animal a1 = new Animal();
		Animal c1 = new Cat();
		Animal d1 =new Dog();
		Animal t1 = new Tiger();
		t1.makeNoise();
		c1.makeNoise();
		d1.makeNoise();
		a1.eat();
		a1.walk();
		}
}
