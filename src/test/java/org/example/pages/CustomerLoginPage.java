package org.example.pages;

import org.openqa.selenium.By;

public class CustomerLoginPage {
    private By txt_email = By.id("email");

    private By txt_password = By.id("pass");

    private By btn_sign_in = By.id("send2");

    private By message_error = By.cssSelector(".page.messages");

    public By getTxt_email() {
        return txt_email;
    }

    public By getTxt_password() {
        return txt_password;
    }

    public By getBtn_sign_in() {
        return btn_sign_in;
    }

    public By getMessage_error() {
        return message_error;
    }
}
