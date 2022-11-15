package Static_nonstatic_variables;

public class Sample {
static int i=10;
int j=20;

public static void main(String[] args) {

System.out.println(i);

Sample s= new Sample();

System.out.println(s.j);
}
}
