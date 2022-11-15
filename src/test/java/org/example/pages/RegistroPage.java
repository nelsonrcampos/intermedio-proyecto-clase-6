package org.example.pages;

import org.openqa.selenium.By;

public class RegistroPage {

    private By titulo = By.xpath("//h1[@class='page-title']");

    private By txt_first_name = By.id("firstname");

    private By txt_last_name = By.id("lastname");

    private By txt_email = By.id("email_address");

    private By txt_password = By.id("password");

    private By txt_confirm_password = By.id("password-confirmation");

    private By btn_create_an_account = By.cssSelector(".action.submit.primary");

    private By txt_first_name_error = By.id("firstname-error");

    public By getTitulo() {
        return titulo;
    }

    public By getTxt_first_name() {
        return txt_first_name;
    }

    public By getTxt_last_name() {
        return txt_last_name;
    }

    public By getTxt_email() {
        return txt_email;
    }

    public By getTxt_password() {
        return txt_password;
    }

    public By getTxt_confirm_password() {
        return txt_confirm_password;
    }

    public By getBtn_create_an_account() {
        return btn_create_an_account;
    }

    public By getTxt_first_name_error() {
        return txt_first_name_error;
    }
}
