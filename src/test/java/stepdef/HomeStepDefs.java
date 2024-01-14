package stepdef;

import prep.TestPrep;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomeStepDefs extends TestPrep {

    HomePage homePage;

    @Then("user is redirected to home page")
    public void userIsRedirectedToHomePage() {
        homePage = new HomePage(driver);
        homePage.isOnHomePage(driver);
    }
}
