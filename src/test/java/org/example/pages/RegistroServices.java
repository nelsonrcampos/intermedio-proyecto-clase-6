package org.example.pages;

import org.example.config.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistroServices {

    private RegistroPage registroPage;

    public RegistroServices() {
        this.registroPage = new RegistroPage();
    }

    public boolean isVisibleTitulo() {
        WebElement titulo = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        this.registroPage.getTitulo()
                )
        );

        return titulo.isDisplayed();

        /*
        return DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        this.registroPage.getTitulo()
                )
        ).isDisplayed();
         */
    }

    public String cualEsElTitulo() {
        return DriverManager.getDriver().findElement(
                this.registroPage.getTitulo()
        ).getText();
    }

    public void ingresar_first_name(String first_name) {
        DriverManager.getDriver().findElement(
                this.registroPage.getTxt_first_name()
        ).sendKeys(first_name);
    }

    public void ingresar_last_name(String last_name) {
        DriverManager.getDriver().findElement(
                this.registroPage.getTxt_last_name()
        ).sendKeys(last_name);
    }

    public void ingresar_email(String email) {
        DriverManager.getDriver().findElement(
                this.registroPage.getTxt_email()
        ).sendKeys(email);
    }

    public void ingresar_password(String password)
    {
        DriverManager.getDriver().findElement(
                this.registroPage.getTxt_password()
        ).sendKeys(password);
    }

    public void ingresar_confirm_password(String confirm_password)
    {
        DriverManager.getDriver().findElement(
                this.registroPage.getTxt_confirm_password()
        ).sendKeys(confirm_password);
    }

    public void click_create_an_account(){
        DriverManager.getDriver().findElement(
                this.registroPage.getBtn_create_an_account()
        ).click();
    }

    public String cual_es_mensaje_error_first_name(){
        return DriverManager.getDriver().findElement(
                this.registroPage.getTxt_first_name_error()
        ).getText();
    }
}
