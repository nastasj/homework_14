package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DuolingoMainPage;
import pages.DuolingoStorePage;

@Tag("duolingo")
public class DuolingoStorePageTests extends TestBase {

    DuolingoMainPage duolingoMainPage = new DuolingoMainPage();
    DuolingoStorePage duolingoStorePage = new DuolingoStorePage();

    @Test
    @Tag("smoke")
    @Tag("regress")
    @DisplayName("Check store page has correct url")
    public void checkStorePageHasCorrectUrlTest() {
        duolingoMainPage
                .openMainPage()
                .goToStorePage();
        duolingoStorePage
                .checkStorePageHasCorrectUrl();
    }

    @Test
    @Tag("smoke")
    @Tag("regress")
    @DisplayName("Check search button is clickable on the store page")
    public void checkSearchButtonIsClickableTest() {
        duolingoStorePage
                .openStorePage()
                .checkSearchButtonIsClickable();
    }

    @Test
    @Tag("smoke")
    @Tag("regress")
    @DisplayName("Check cart button is clickable on the store page")
    public void checkCartButtonIsClickableTest() {
        duolingoStorePage
                .openStorePage()
                .checkCartButtonIsClickable();
    }
}
