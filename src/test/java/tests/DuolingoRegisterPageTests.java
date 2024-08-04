package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DuolingoMainPage;
import pages.DuolingoRegisterPage;

@Tag("duolingo")
public class DuolingoRegisterPageTests extends TestBase {

    DuolingoMainPage duolingoMainPage = new DuolingoMainPage();
    DuolingoRegisterPage duolingoRegisterPage = new DuolingoRegisterPage();

    @Test
    @Tag("smoke")
    @Tag("regress")
    @DisplayName("Check register page has correct url")
    public void checkRegisterPageHasCorrectUrlTest() {
        duolingoMainPage
                .openMainPage()
                .goToRegisterPage();
        duolingoRegisterPage
                .checkRegisterPageHasCorrectUrl();
    }

    @Test
    @Tag("smoke")
    @Tag("regress")
    @DisplayName("Check register")
    public void checkRegisterTest() {
        duolingoRegisterPage
                .openRegisterPage()
                .selectLanguage()
                .selectSourceOfKnowledge()
                .selectPurposeOfLearning()
                .selectLanguageLevel()
                .selectDailyLearningGoal()
                .clickOnNotificationsButton()
                .selectPathToStartLearning()
                .checkLessonPageHasCorrectUrl();
    }
}
