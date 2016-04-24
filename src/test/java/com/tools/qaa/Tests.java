package com.tools.qaa;

import com.tools.qaa.pages.LoginPage;
import org.testng.annotations.Test;

public class Tests {

	@Test
	public void someTest() {
		new LoginPage().login("uname", "pass");
	}
}
