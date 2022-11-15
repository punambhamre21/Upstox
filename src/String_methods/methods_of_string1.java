package String_methods;

public class methods_of_string1 {
public static void main(String[] args) 
throws Throwable {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="velo";
//lastingdex of-->it will give index of duplicate character
	System.out.println(s1.lastIndexOf("ve"));//true
	//endswith-->it will check given string is end with particular character or not
	System.out.println(s1.endsWith("ty"));//true
	System.out.println(s2.endsWith("TY"));//true
	//if we want to break the string substring()
	System.out.println(s1.substring(4));//city
	System.out.println(s1.substring(2));
	//how to concat two string concat()
	System.out.println(s1.concat(s3));//velocityvelo
	//replace method will replace the string
	System.out.println(s1.replace("city","rural"));
}
}
