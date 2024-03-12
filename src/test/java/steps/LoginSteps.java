package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import po.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Then("I enter {string} as username")
    public void iEnterAsUsername(String value) {
        loginPage.enterUsername(value);
    }


    @Then("I enter {string} as password")
    public void iEnterAsPassword(String value) {
        loginPage.enterPassword(value);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }
}
