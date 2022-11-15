package Methods;

public class SRM_call_from_sameclass {
public static void main(String[] args) {
	System.out.println("Main method is statrted");	
	m1();
	m2();
	
	
	System.out.println("Main method is ended");
}

public static void  m1() {
	System.out.println("i am runing from regular method m1");
}
	
public static void  m2() {
	System.out.println("i am running from regular method m2");
}

	}

