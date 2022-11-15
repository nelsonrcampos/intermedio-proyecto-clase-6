package org.example.base;

import org.example.config.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {

    @BeforeMethod
    public void setup(){
        System.out.println("@BeforeMethod heredado");

        DriverManager.create("chrome");
    }

    @AfterMethod
    public void tearDown(){
        //Cerramos el browser
        DriverManager.quit();
    }
}
