package org.example.tests;

import org.example.base.BaseTests;
import org.example.config.DriverManager;
import org.example.pages.CustomerLoginServices;
import org.example.pages.PrincipalServices;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCustomerLogin extends BaseTests {

    @BeforeMethod
    public void su_propio_before_method(){
        System.out.println("@BeforeMethod propio de la clase del test");
    }

    @Test(testName = "TC - Iniciar Sesion con usuario suspendido")
    public void iniciar_sesion_usuario_suspendido(){
        PrincipalServices principalServices = new PrincipalServices();
        CustomerLoginServices customerLoginServices = new CustomerLoginServices();

        principalServices.irHome();
        principalServices.click_iniciar_sesion();

        customerLoginServices.iniciar_sesion("nelson@ggmai.com", "Nelson12345");

        Assert.assertTrue(
                customerLoginServices.es_visible_mensaje_error(),
                "Mensaje de error visible"
        );

        Assert.assertEquals(
                customerLoginServices.cual_es_mensaje_error(),
                "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.",
                "Validando texto del mensaje de error"
        );
    }

}
