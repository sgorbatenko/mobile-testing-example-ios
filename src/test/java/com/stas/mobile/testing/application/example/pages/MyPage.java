
package com.stas.mobile.testing.application.example.pages;

import com.stas.mobile.testing.framework.device.controls.Button;
import com.stas.mobile.testing.framework.device.controls.Text;
import com.stas.mobile.testing.framework.device.controls.TextBox;

public class MyPage
{
    private TextBox fistNumber = new TextBox("TextField1");
    private TextBox secondNumber = new TextBox("TextField2");
    private Button computeSum = new Button("Compute Sum");
    private Text result = new Text("Answer");

    public TextBox getFistNumber()
    {
        return fistNumber;
    }

    public TextBox getSecondNumber()
    {
        return secondNumber;
    }

    public Button getComputeSum()
    {
        return computeSum;
    }

    public Text getResult()
    {
        return result;
    }
}
