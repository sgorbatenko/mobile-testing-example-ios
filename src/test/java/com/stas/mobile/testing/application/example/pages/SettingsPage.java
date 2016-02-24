
package com.stas.mobile.testing.application.example.pages;

import com.stas.mobile.testing.framework.device.controls.Button;

public class SettingsPage
{
    public Button getGeneral()
    {
        return _general;
    }

    public Button getAbout()
    {
        return _about;
    }

    private Button _general = new Button("General");
    private Button _about = new Button("About");
}
