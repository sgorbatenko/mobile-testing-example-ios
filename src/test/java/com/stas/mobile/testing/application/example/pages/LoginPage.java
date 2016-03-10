
package com.stas.mobile.testing.application.example.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.stas.mobile.testing.framework.util.drivers.WebDriverWrapper;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage
{
    public LoginPage()
    {
        PageFactory.initElements(
            new AppiumFieldDecorator(WebDriverWrapper.getAppiumDriver()), this);
    }

    @iOSFindBy(className = "UIATextField")
    @CacheLookup
    private MobileElement userName;
    @iOSFindBy(className = "UIASecureTextField")
    @CacheLookup
    private MobileElement password;
    @iOSFindBy(name = "Login")
    @CacheLookup
    private MobileElement loginBtn;
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")
    private MobileElement alertOkBtn;

    public MobileElement getUserName()
    {
        return userName;
    }

    public MobileElement getPassword()
    {
        return password;
    }

    public MobileElement getLoginBtn()
    {
        return loginBtn;
    }

    public MobileElement getAlertOkBtn()
    {
        return alertOkBtn;
    }
}
