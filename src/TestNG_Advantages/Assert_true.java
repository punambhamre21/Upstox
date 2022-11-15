package TestNG_Advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true {
	@Test
public void TC4() {
	Reporter.log("running tc4",true);
	boolean actR=true;
	Assert.assertTrue(actR);
}
}
