package Exception_Handling;

public class SIOBE {
public static void main(String[] args) 
	throws Throwable {
		String s1="velocity";

		try {
			System.out.println(s1.charAt(8));//we r trying to fetch data which is not present}
		}
			catch(StringIndexOutOfBoundsException a) {
				System.out.println("Idiot there is no data trying to fetch");
			}
			Thread.sleep(3000);
		}
	
}

