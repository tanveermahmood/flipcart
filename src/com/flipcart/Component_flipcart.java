package com.flipcart;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Component_flipcart extends QAFWebComponent{

	public Component_flipcart(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	@FindBy(locator = "mobilelist")
	private List<Component_flipcart> mobilelist;
	@FindBy(locator = "mobilename")
	private List<QAFWebElement> mobilename;
	@FindBy(locator = "mobileprice")
	private List<QAFWebElement> mobileprice;
	
	public List<QAFWebElement> getMobilename() {
		return mobilename;
	}

	public List<QAFWebElement> getMobileprice() {
		return mobileprice;
	}

public void getMobileNames()
{
	List<QAFWebElement> eles =getMobilename();
	for(QAFWebElement ele : eles)
	{
		System.out.println( ele.getText());
	}
}
public void getMobilePrices()
{
	List<QAFWebElement> eles =getMobileprice();
	for(QAFWebElement ele : eles)
	{
		System.out.println( ele.getText());
	}
}
}
