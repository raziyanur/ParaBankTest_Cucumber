package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before()
    {
        System.out.println("Scenario started");
    }

    @After
    public void after()
    {
        // ekran görüntüsü al senaryo hatalı ise
        GWD.quitDriver();
    }

}

