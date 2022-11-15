package Test_ng_programms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable2 {
	@Test(enabled=false)//intentionally we are ingonred tc1
	public void TC1() {
		Reporter.log("running tc1",true);
	}
	@Test
	public void TC2() {
		Reporter.log("running tc2",true);
	}
	}


