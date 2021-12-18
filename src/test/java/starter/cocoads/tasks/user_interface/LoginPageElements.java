package starter.cocoads.tasks.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageElements {

    //.icon_lang.icon_lang-en
    public static Target FLAG_ICON =
            Target.the("English lang icon")
                    .locatedBy(".icon_lang.icon_lang-en");

    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.name("email"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.name("password"));
    public static Target LOGIN_BTN = Target.the("login btn").locatedBy("//*[@id=\"client-login\"]/form/button");


}
