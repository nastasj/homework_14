package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.DuolingoPage;

import static com.codeborne.selenide.Selenide.open;

@Tag("duolingo")
public class DuolingoWebTests extends TestBase {

    DuolingoPage duolingoPage = new DuolingoPage();

    @CsvSource(value = {
            "https://fr.duolingo.com | La méthode gratuite, fun et efficace pour apprendre une langue !",
            "https://it.duolingo.com/ | Il metodo gratuito, efficace e divertente per imparare le lingue!",
            "https://en.duolingo.com/ | The free, fun, and effective way to learn a language!",
            "https://de.duolingo.com/ | Effektiv und kostenlos eine Sprache lernen – und dabei Spaß haben!",
    }, delimiter = '|')
    @ParameterizedTest(name = "When opening site {0} welcome message {1} should be displayed")
    void checkDisplayCorrectGreeting(String url, String greeting) {
        open(url);
        duolingoPage.checkGreeting(greeting);
    }

    @Test
    @DisplayName("Check careers page")
    public void checkCareersPageTest() {
        duolingoPage
                .openMainPage()
                .goToCareersPage()
                .checkCareersPage();
    }

    @Test
    @DisplayName("Check contact page")
    public void checkContactPageTest() {
        duolingoPage
                .openMainPage()
                .goToContactPage()
                .checkContactPage();
    }

    @Test
    @DisplayName("Check store page")
    public void checkStorePageTest() {
        duolingoPage
                .openMainPage()
                .goToStorePage()
                .checkStorePage();
    }

    @Test
    @DisplayName("Check register page")
    public void checkRegisterPageTest() {
        duolingoPage
                .openMainPage()
                .goToRegisterPage()
                .checkRegisterPage();
    }
}
