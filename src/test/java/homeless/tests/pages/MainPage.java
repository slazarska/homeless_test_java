package homeless.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import homeless.tests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {

    private static final String MAIN_PAGE_URL = "https://homeless.ru/";
    private static final String TITLE = "Ночлежка — старейшая благотворительная организация, помогающая бездомным людям.";

    SelenideElement logo = $(".logo-main");

    @Step("Open Main Page")
    public void openMainPage() {
        open(MAIN_PAGE_URL);
    }

    @Step("Check Main Page is opened")
    public void checkMainPageIsOpened() {
        logo.shouldBe(Condition.visible);
    }

    @Step("Check Main page title")
    public void checkTitle() {
        String expectedTitle = TITLE;
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @Step("Check Main page console log have no errors")
    public void checkConsoleLogHaveNoErrors() {
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";
        assertThat(consoleLogs).doesNotContain(errorText);
    }
}
