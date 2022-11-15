package org.example.pages;

import org.example.config.DriverManager;

public class PrincipalServices {

    private PrincipalPage principalPage;

    private String url;

    public PrincipalServices(){
        this.principalPage = new PrincipalPage();
    }

    public void irHome(){
        DriverManager.visitar(this.principalPage.getUrl());
    }

    public void crear_cuenta(){
        DriverManager.getDriver().findElement(
                this.principalPage.getLink_create_account()
        ).click();
    }

    public void click_iniciar_sesion(){
        DriverManager.getDriver().findElement(
                this.principalPage.getLink_sign_in()
        ).click();
    }
}
