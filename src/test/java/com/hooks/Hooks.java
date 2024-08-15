package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

   //@Before("@bvt")
    public void preProd(){
        System.err.println("Pre check done before production");
        System.out.println("****************************** ");
    }

    @Before(order = 1)
    public void launchBrowser(){
        System.out.println("Launch the browser ");

    }
    @After(order = 1)
    public void quitBrowser(){
        System.out.println("Quit the browser ");
    }

    @Before(order = 2)
    public void maximizeBrowser(){
        System.out.println("Maximize the browser and apply the wait");
    }

    //@BeforeStep
    public void beforeSteps(){
        System.out.println("Executing before Steps");
    }

    //@AfterStep
    public void afterSteps(){
        System.out.println("Executing after Steps");
    }

    @After(order = 2)
    public void clearCache(){
        System.out.println("Clear the Cache ");
        System.out.println("============================ ");
    }

}
