package SmartFocus;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by sadha on 20/07/2016.
 */
public class SearchSteps {
    @When("^I enter as \"([^\"]*)\"$")
    public void i_enter_as(String company)  {
        new SearchPage().search(company);
        new SearchPage().searchClick();

    }

    @When("^I click on smartfocus$")
    public void i_click_on_smartfocus()  {
        new SearchPage().smart();
    }

    @When("^I select Smart Personalisation Email$")
    public void i_select_Smart_Personalisation_Email() {
        new HomePage()._personalizationLink();

    }
    @Then("^I should be view  Smart Personalization Email successfully$")
    public void i_should_be_view_Smart_Personalization_Email_successfully()  {
        Assert.assertTrue(new PersonalizeEmailPage().emailVerify());
    }

    @Then("^I should be view  Smart Personalization Web  successfully$")
    public void i_should_be_view_Smart_Personalization_Web_successfully()  {
        Assert.assertTrue(new PersonalizeEmailPage().emailVerify());
    }

}
