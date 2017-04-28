package com.flipcart;

import org.testng.annotations.Test;

public class Flipcart {
	@Test(groups = { "SMOKE" }, description = "")
	public void scenario2() throws InterruptedException {
		FlipcartTestPage fp = new FlipcartTestPage();
		fp.launchPage(null);
		fp.getDetails();
	}
}
