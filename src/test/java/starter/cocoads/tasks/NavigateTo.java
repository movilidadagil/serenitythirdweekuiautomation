package starter.cocoads.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.cocoads.tasks.user_interface.CocoAdsHomePage;

public class NavigateTo {
    public static Performable theCocoAdsLoginPage() {
        return Task.where("{0} opens the cocoads login page",
                Open.browserOn().the(CocoAdsHomePage.class));
    }
}
