package TestNG_Advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
@Test
public void TC1() {
	Reporter.log("running TC1",true);
	String expR="hi";
	String actR="Bye";  //object of assert
	SoftAssert s=new SoftAssert();
	s.assertEquals(expR,actR); //verification1
	System.out.println("i am after failed verification1"); //verification2
	
	//mandatory
	s.assertAll();
}
@Test
public void TC2() {
	Reporter.log("hi hello");
}
}
