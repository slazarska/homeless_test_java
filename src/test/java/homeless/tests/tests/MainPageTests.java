package homeless.tests.tests;

import homeless.tests.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Open main page")
    void openMainPageTest() {
        mainPage.openMainPage();
        mainPage.checkMainPageIsOpened();
    }

    @Test
    @DisplayName("Main page title should have header text")
    void mainPageTitleTest() {
        mainPage.openMainPage();
        mainPage.checkTitle();
    }

    @Test
    @DisplayName("Page console log should have no errors")
    void consoleLogTest() {
        mainPage.openMainPage();
        mainPage.checkConsoleLogHaveNoErrors();
    }
}
