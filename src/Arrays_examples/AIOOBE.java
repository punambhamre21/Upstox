package Arrays_examples;

public class AIOOBE {
public static void main(String[] args) {
	String ar[]=new String[5];
	ar[0]="Samntha";
	ar[1]="Rashmika";
	ar[2]="Sai pallavi";
	ar[3]="Niveda Thomas";
	ar[4]="Kirthy suresh";
	//print the data which is not present 
	try {
		System.out.println(ar[5]);//AIOOBE
	}
	catch(ArrayIndexOutOfBoundsException donky) {
		System.out.println("idiot there is no data still u r trying to fetch it means u r waste fellow");
	}
}
}
