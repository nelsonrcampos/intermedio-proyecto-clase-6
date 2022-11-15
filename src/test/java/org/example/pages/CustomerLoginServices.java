package org.example.pages;

import org.example.config.DriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CustomerLoginServices {

    private CustomerLoginPage customerLoginPage;

    public CustomerLoginServices() {
        this.customerLoginPage = new CustomerLoginPage();
    }

    public void iniciar_sesion(String email, String password){
        DriverManager.getDriver().findElement(
                this.customerLoginPage.getTxt_email()
        ).sendKeys(email);

        DriverManager.getDriver().findElement(
                this.customerLoginPage.getTxt_password()
        ).sendKeys(password);

        DriverManager.getDriver().findElement(
                this.customerLoginPage.getBtn_sign_in()
        ).click();
    }

    public Boolean es_visible_mensaje_error(){
        return DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(this.customerLoginPage.getMessage_error())
        ).isDisplayed();
    }

    public String cual_es_mensaje_error(){
        return DriverManager.getDriver().findElement(
                this.customerLoginPage.getMessage_error()
        ).getText();
    }
}
