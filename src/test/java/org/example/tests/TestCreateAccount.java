package org.example.tests;

import org.example.base.BaseTests;
import org.example.models.User;
import org.example.pages.MyAccountServices;
import org.example.pages.PrincipalServices;
import org.example.pages.RegistroServices;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateAccount extends BaseTests {

    @Test(testName = "TC - Crear una cuenta nueva")
    public void create_a_account_new()  {

        PrincipalServices principalServices = new PrincipalServices();
        RegistroServices registroServices = new RegistroServices();
        MyAccountServices myAccountServices = new MyAccountServices();

        //1- Ir a la pagina principal
        principalServices.irHome();
        //2- Ir a crear una nueva cuenta
        principalServices.crear_cuenta();


        //3- Validamos que estamos en la pagina de crear una nueva cuenta
        Assert.assertTrue(registroServices.isVisibleTitulo());
        Assert.assertEquals(
                registroServices.cualEsElTitulo(),
                "Create New Customer Account",
                "El titulo de la pagina de registrar nueva cuenta"
        );

        //4- Agregamos los datos necesarios para crear una nueva cuenta
        registroServices.ingresar_last_name("Campos");
        registroServices.ingresar_first_name("Nelson");
        registroServices.ingresar_email("n@ggggmail.com");
        registroServices.ingresar_password("Nelson12345");
        registroServices.ingresar_confirm_password("Nelson12345");

        //5- Click en crear una cuenta nueva
        registroServices.click_create_an_account();

        //6- Validamos el mensaje de cuenta creada con exito
        Assert.assertTrue(
                myAccountServices.esVisibleMensaje(),
                "Es visible el mensaje de exito"
        );
        Assert.assertTrue(
                myAccountServices.cualEsElMensaje()
                        .contains("Thank you for registering with Fake Online Clothing Store."),
                "El mensaje de registro exitoso"
        );
    }

    @Test(testName = "TC - Crear una cuenta nueva sin ingresar firts name")
    public void create_a_account_new_sin_ingresar_firts_name()  {
        PrincipalServices principalServices = new PrincipalServices();
        RegistroServices registroServices = new RegistroServices();
        MyAccountServices myAccountServices = new MyAccountServices();

        //1- Ir a la pagina principal
        principalServices.irHome();
        //2- Ir a crear una nueva cuenta
        principalServices.crear_cuenta();


        //3- Validamos que estamos en la pagina de crear una nueva cuenta
        Assert.assertTrue(registroServices.isVisibleTitulo());
        Assert.assertEquals(
                registroServices.cualEsElTitulo(),
                "Create New Customer Account",
                "El titulo de la pagina de registrar nueva cuenta"
        );

        //4- Agregamos los datos necesarios para crear una nueva cuenta
        registroServices.ingresar_last_name("Campos");
        //registroServices.ingresar_first_name("Nelson");
        registroServices.ingresar_email("n@ggggmail.com");
        registroServices.ingresar_password("Nelson12345");
        registroServices.ingresar_confirm_password("Nelson12345");

        //5- Click en crear una cuenta nueva
        registroServices.click_create_an_account();

        //6- Validamos el mensaje de error de firts name
        Assert.assertEquals(
                registroServices.cual_es_mensaje_error_first_name(),
                "This is a required field."
        );
    }

    @Test(testName = "TC - Crear una cuenta nueva datos dinamicos")
    public void create_a_account_new_data_dynamic() throws InterruptedException {
        User usuario = new User();

        PrincipalServices principalServices = new PrincipalServices();
        RegistroServices registroServices = new RegistroServices();
        MyAccountServices myAccountServices = new MyAccountServices();

        //1- Ir a la pagina principal
        principalServices.irHome();
        //2- Ir a crear una nueva cuenta
        principalServices.crear_cuenta();


        //3- Validamos que estamos en la pagina de crear una nueva cuenta
        Assert.assertTrue(registroServices.isVisibleTitulo());
        Assert.assertEquals(
                registroServices.cualEsElTitulo(),
                "Create New Customer Account",
                "El titulo de la pagina de registrar nueva cuenta"
        );

        //4- Agregamos los datos necesarios para crear una nueva cuenta
        registroServices.ingresar_last_name(usuario.getLast_name());
        registroServices.ingresar_first_name(usuario.getFirst_name());
        registroServices.ingresar_email(usuario.getEmail());
        registroServices.ingresar_password(usuario.getPassword());
        registroServices.ingresar_confirm_password(usuario.getPassword());

        //5- Click en crear una cuenta nueva
        registroServices.click_create_an_account();

        //6- Validamos el mensaje de cuenta creada con exito
        Assert.assertTrue(
                myAccountServices.esVisibleMensaje(),
                "Es visible el mensaje de exito"
        );
        Assert.assertTrue(
                myAccountServices.cualEsElMensaje()
                        .contains("Thank you for registering with Fake Online Clothing Store."),
                "El mensaje de registro exitoso"
        );
    }
}
