
package com.stas.mobile.testing.application.example.pages;

import org.openqa.selenium.support.PageFactory;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MyPage2
{
    public MyPage2()
    {
        PageFactory.initElements(
            new AppiumFieldDecorator(WebDriverWrapper.getAppiumDriver()), this);
    }

    @iOSFindBy(uiAutomator = ".textFields()[0]")
    private MobileElement fistNumber;
    @iOSFindBy(uiAutomator = ".textFields()[1]")
    private MobileElement secondNumber;
    @iOSFindBy(uiAutomator = ".buttons()[0]")
    private MobileElement computeSum;
    @iOSFindBy(uiAutomator = ".staticTexts()[0]")
    private MobileElement result;

    public MobileElement getFistNumber()
    {
        return fistNumber;
    }

    public MobileElement getSecondNumber()
    {
        return secondNumber;
    }

    public MobileElement getComputeSum()
    {
        return computeSum;
    }

    public MobileElement getResult()
    {
        return result;
    }
}
