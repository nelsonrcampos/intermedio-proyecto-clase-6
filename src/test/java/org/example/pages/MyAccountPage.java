package org.example.pages;

import org.openqa.selenium.By;

public class MyAccountPage {

    private By message = By.cssSelector(".page.messages");

    public By getMessage() {
        return message;
    }
}
