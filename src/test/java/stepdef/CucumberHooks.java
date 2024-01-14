package stepdef;

import prep.TestPrep;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends TestPrep {
    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }

}
