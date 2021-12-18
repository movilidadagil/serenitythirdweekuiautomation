package starter.n11.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11LoginPageElements {
   public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("email"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("password"));
    public static Target LOGIN_BTN = Target.the("login btn").located(By.id("loginButton"));



}
