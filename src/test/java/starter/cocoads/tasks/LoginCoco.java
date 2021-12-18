package starter.cocoads.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.cocoads.tasks.user_interface.CocoAdsHomePage;
import starter.cocoads.tasks.user_interface.LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginCoco implements Task {

    private final String email_text;
    private final String password_text;

    @Step("{0} Login with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LoginPageElements.FLAG_ICON),
                WaitUntil.the(LoginPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(LoginPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(LoginPageElements.EMAIL_FIELD),
                Click.on(LoginPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(LoginPageElements.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );





    }

    public LoginCoco(String email_text, String password_text){
        this.email_text = email_text;
        this.password_text = password_text;

    }



    public static LoginCoco loginThePage(String email_text, String password_text) {
        return instrumented(LoginCoco.class
                ,email_text,password_text);
    }

}
