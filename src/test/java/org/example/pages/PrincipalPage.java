package org.example.pages;

import org.openqa.selenium.By;

public class PrincipalPage {

    private String url = "https://magento.softwaretestingboard.com/";

    private By link_create_account = By.linkText("Create an Account");

    private By link_sign_in = By.linkText("Sign In");


    public String getUrl() {
        return url;
    }

    public By getLink_create_account() {
        return link_create_account;
    }

    public By getLink_sign_in() {
        return link_sign_in;
    }
}
