package Casting;

public class Nonprimitive_upcasting_ULC {
	public static void main (String[] args) {
		Nonprimitive_upcasting_father s=new Nonprimitive_upcasting_son();
		s.money();
		System.out.println("propeties of son");
		Nonprimitive_upcasting_son S2=new Nonprimitive_upcasting_son();
		S2.car();
	}

}