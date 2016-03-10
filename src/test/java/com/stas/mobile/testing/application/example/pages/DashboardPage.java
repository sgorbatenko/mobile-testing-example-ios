
package com.stas.mobile.testing.application.example.pages;

import org.openqa.selenium.support.PageFactory;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class DashboardPage
{
    public DashboardPage()
    {
        PageFactory.initElements(
            new AppiumFieldDecorator(WebDriverWrapper.getAppiumDriver()), this);
    }

    @iOSFindBy(accessibility = "Title")
    private MobileElement title;

    public MobileElement getTitle()
    {
        return title;
    }
}
