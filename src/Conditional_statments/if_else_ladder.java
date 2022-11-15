package Conditional_statments;

public class if_else_ladder {
public static void main(String[] args) {
	int marks=30;
	if(marks>=75) {
		System.out.println("pass with distinction");
	}
	else if (marks>=60) {
	System.out.println("pass with first class");
}
else if (marks>=50) {
	System.out.println("pass with second class");
}
else if(marks>=40) {
	System.out.println("pass with third class");
}
else if(marks>=35) {
	System.out.println("pass");
}
else {
	System.out.println("Fail0");
	}
}
}
