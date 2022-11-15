package Static_nonstatic_variables;

public class Test {
static int i=20;
int j=40;

public static void main(String[] args) {
	System.out.println(i);
	
	Test t= new Test();
	System.out.println(t.j);
	
}
}
