
package Logical_Programs;

import java.util.Scanner;

public class Replace_spl_chrs {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter string which contain spl chars");
		String name=s.next();
		String correctname=name.replace("@","a");
		System.out.println(correctname);
	}
}
