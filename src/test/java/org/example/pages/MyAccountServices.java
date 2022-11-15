package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.config.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountServices {
    private MyAccountPage myAccountPage;

    public MyAccountServices(){
        this.myAccountPage = new MyAccountPage();
    }

    public String cualEsElMensaje(){
        return DriverManager.getDriver().findElement(
                this.myAccountPage.getMessage()
        ).getText();
    }

    public Boolean esVisibleMensaje(){
        return DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(this.myAccountPage.getMessage())
        ).isDisplayed();
    }
}
