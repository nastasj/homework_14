package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.currentFrameUrl;

public class DuolingoPage {

    private final SelenideElement
            greetingTitle = $(".L93Ok"),
            careersButton = $("a[href='https://careers.duolingo.com']"),
            careersTitle = $(byTagAndText("h1", "work at duolingo")),
            typeSelect =$(byTagAndText("option", "All types")),
            departmentSelect = $(byTagAndText("option", "All departments")),
            locationSelect = $(byTagAndText("option", "All locations")),
            contactsButton = $("a[href='/contact']"),
            helpButton = $("a[href='/help']"),
            pressButton = $("a[href='mailto:press@duolingo.com']"),
            partnershipsButton = $("a[href='mailto:partnerships@duolingo.com']"),
            storeButton = $("a[href='https://store.duolingo.com/']"),
            searchButton = $(".nav-item [aria-label=Search]"),
            cartButton = $(".nav-item .cart-icon"),
            startButton = $("[data-test=get-started-top]"),
            languageCard = $("button [data-test]"),
            continueButton = $("[data-test=funboarding-continue-button]"),
            radioChoice = $("[role=radio]"),
            purposeChoice = $("[data-test=work]"),
            levelChoice = $("[data-test=prior-proficiency-card]"),
            allowButton = $("[data-test=daily-reminder] button");

    @Step("Open main page")
    public DuolingoPage openMainPage() {
        open("https://duolingo.com/");
        return this;
    }

    @Step("Check greeting is displayed correctly in appropriate language")
    public DuolingoPage checkGreeting(String greeting) {
        greetingTitle.shouldHave(text(greeting));
        return this;
    }

    @Step("Open careers page")
    public DuolingoPage goToCareersPage() {
        careersButton.scrollIntoView(true).click();
        return this;
    }

    @Step("Check careers page")
    public DuolingoPage checkCareersPage() {
        String careersPageUrl = "https://careers.duolingo.com/";
        webdriver().shouldHave(currentFrameUrl(careersPageUrl));
        careersTitle.should(exist);
        typeSelect.shouldBe(clickable);
        departmentSelect.shouldBe(clickable);
        locationSelect.shouldBe(clickable);
        return this;
    }

    @Step("Open contact page")
    public DuolingoPage goToContactPage() {
        contactsButton.scrollIntoView(true).click();
        return this;
    }

    @Step("Check contact page")
    public DuolingoPage checkContactPage() {
        String contactPageUrl = "https://www.duolingo.com/contact";
        webdriver().shouldHave(currentFrameUrl(contactPageUrl));
        helpButton.shouldBe(clickable);
        pressButton.shouldHave(text("press@duolingo.com"));
        partnershipsButton.shouldHave(text("partnerships@duolingo.com"));
        return this;
    }

    @Step("Open store page")
    public DuolingoPage goToStorePage() {
        storeButton.scrollIntoView(true).click();
        return this;
    }

    @Step("Check store page")
    public DuolingoPage checkStorePage() {
        String storePageUrl = "https://store.duolingo.com/";
        webdriver().shouldHave(currentFrameUrl(storePageUrl));
        searchButton.shouldBe(clickable);
        cartButton.shouldBe(clickable);
        return this;
    }

    @Step("Open register page")
    public DuolingoPage goToRegisterPage() {
        startButton.click();
        return this;
    }

    @Step("Check register page")
    public DuolingoPage checkRegisterPage() {
        String registerPageUrl = "https://www.duolingo.com/register";
        String lessonPageUrl = "https://www.duolingo.com/lesson";
        int timeOutLimit = 10;
        webdriver().shouldHave(currentFrameUrl(registerPageUrl));
        languageCard.click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        radioChoice.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        purposeChoice.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        levelChoice.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        radioChoice.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        allowButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        radioChoice.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        continueButton.shouldBe(clickable, Duration.ofSeconds(timeOutLimit)).click();
        webdriver().shouldHave(currentFrameUrl(lessonPageUrl));
        return this;
    }


}

