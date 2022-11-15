package TestNG_Advantages;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asser_not_equals {
@Test
public void TC2() {
	Reporter.log("running TC2",true);
	String expR="Rinky";
			String actR="Rinky";
			Assert.assertEquals(expR,actR);
}
}
