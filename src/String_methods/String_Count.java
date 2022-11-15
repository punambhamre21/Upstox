//TO count Upper case letters and lowercase letters from given string
package String_methods;

public class String_Count {
	public static void main(String[] args) {
		String s="Welcome To Java";
		int countuppercase=0;
		int countlowercase=0;
		for(int i=0;i<=s.length()-1;i++) {
			
			if(s.charAt(i)<='Z'&&s.charAt(i)>='A') {
				
				countuppercase++;
				
			}
			
			else if(s.charAt(i)!=' ') {
				
				countlowercase++;
			}
			
		}
		
		System.out.println(countuppercase);
		System.out.println(countlowercase);
	}

}
