package starter.n11.navigation.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.n11.navigation.user_interface.n11HomePageElements;
import starter.n11.navigation.user_interface.n11LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LoginAsUser implements Task {

    private final String email_text;
    private final String password_text;

    @Step("{0} Login with email '#email_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11HomePageElements.LOGIN_LINK),
                WaitUntil.the(n11LoginPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(n11LoginPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11LoginPageElements.EMAIL_FIELD),
                Click.on(n11LoginPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11LoginPageElements.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
                );



    }

    public LoginAsUser(String email_text, String password_text){
        this.email_text = email_text;
        this.password_text = password_text;

    }



    public static LoginAsUser loginThePage(String email_text, String password_text) {
        return instrumented(LoginAsUser.class
                ,email_text,password_text);
    }

}
