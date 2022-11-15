package TestNG_Advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
@Test
public void TC1() {
	Reporter.log("running tc1");
}
@Test
public void TC2() {
	Reporter.log("running tc2");
	Assert.fail();
}
}
