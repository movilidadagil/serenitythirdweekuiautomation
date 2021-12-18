package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.n11.navigation.login.LoginAsUser;
import starter.n11.navigation.tasks.NavigateTo;
import starter.n11.navigation.user_interface.n11UserHomePageElements;

public class CocoadsStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Given("Hasan continues in english")
    public void hasanContinuesInEnglish() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theCocoLoginPage());

    }

    @When("Hasan logs in to cocoads")
    public void hasanLogsInToCocoads() {
        actor.attemptsTo(LoginEnglishCoco.loginThePage("serenitysdet@gmail.com","serenitysdet-1"));

    }

    @Then("he should see information about his account in cocoads")
    public void heShouldSeeInformationAboutHisAccountInCocoads() {
        actor.attemptsTo(
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).isDisplayed(),
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).value().startsWith("serenity")

        );
    }
}
