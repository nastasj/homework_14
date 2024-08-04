package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DuolingoContactPage;
import pages.DuolingoMainPage;

@Tag("duolingo")
public class DuolingoContactPageTests extends TestBase {

    DuolingoMainPage duolingoMainPage = new DuolingoMainPage();
    DuolingoContactPage duolingoContactPage = new DuolingoContactPage();

    @Test
    @Tag("smoke")
    @Tag("regress")
    @DisplayName("Check contact page has correct url")
    public void checkContactPageHasCorrectUrlTest() {
        duolingoMainPage
                .openMainPage()
                .goToContactPage();
        duolingoContactPage
                .checkContactPageHasCorrectUrl();
    }

    @Test
    @Tag("regress")
    @DisplayName("Check help button is clickable")
    public void checkHelpButtonIsClickableTest() {
        duolingoContactPage
                .openContactPage()
                .checkHelpButtonIsClickable();
    }

    @Test
    @Tag("regress")
    @DisplayName("Check contact emails are correct")
    public void checkContactEmailsAreCorrectTest() {
        duolingoContactPage
                .openContactPage()
                .checkContactEmailsAreCorrect();
    }
}
