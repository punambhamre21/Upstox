package Test_ng_programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
@Test(invocationCount=10)
public void TC1() {
	Reporter.log("running tc1",true);
}
}
