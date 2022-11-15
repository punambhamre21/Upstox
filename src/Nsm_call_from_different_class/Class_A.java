
package Nsm_call_from_different_class;

public class Class_A {//ULC
	public static void main (String[] args) {
		System.out.println("main method started");
	Class_B b= new Class_B();
	b.t1();
	b.t2();
	
	System.out.println("main method ended");
	}

}
