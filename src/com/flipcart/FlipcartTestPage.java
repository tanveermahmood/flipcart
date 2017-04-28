package com.flipcart;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlipcartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "mobile")
	private QAFWebElement mobile;
	@FindBy(locator = "viewall")
	private QAFWebElement viewall;
	@FindBy(locator = "mobilelist")
	private Component_flipcart cart;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		driver.get("/");
	}

	public QAFWebElement getMobile() {
		return mobile;
	}

	public QAFWebElement getViewall() {
		return viewall;
	}

	public Component_flipcart getMobilelist() {
		return cart;
	}

public void getDetails() throws InterruptedException{
	
	getMobile().click();
	Thread.sleep(3000);
	getViewall().click();
	Thread.sleep(3000);
	cart.getMobileNames();
	cart.getMobilePrices();
	
}
}