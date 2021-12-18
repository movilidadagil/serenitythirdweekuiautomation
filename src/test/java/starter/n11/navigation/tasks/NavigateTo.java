package starter.n11.navigation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11.navigation.user_interface.n11HomePage;

public class NavigateTo {
    public static Performable theN11HomePage() {
        return Task.where("{0} opens the n11 home page",
                Open.browserOn().the(n11HomePage.class));
    }
}
