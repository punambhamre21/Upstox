package Exception_Handling;

public class Exception_handling_mechanism {
public static void main(String[] args) 
	throws InterruptedException {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch(RuntimeException e) {
			System.out.println("idiot enetr valid denominator");
			Thread.sleep(3000);
		}
}
}
