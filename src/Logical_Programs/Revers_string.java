
package Logical_Programs;

public class Revers_string {
public static void main(String[] args) {
	String org="PUNAM";
	
	for (int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	
}
}
