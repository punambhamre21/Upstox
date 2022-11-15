package Overriding;

public class Overriding1 {//ULC
	public static void main(String[] args) {
		System.out.println("Take talk of cat");
		Cat c=new Cat();
		c.talk();
		
		System.out.println("take talk of dog");
		Dog d=new Dog();
		d.talk();
	}

}
