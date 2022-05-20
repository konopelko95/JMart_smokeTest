package kz.jusan.selenide;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.TestCaseId;
import ru.yandex.qatools.allure.model.SeverityLevel;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class JMartSmokeTest {

    PageObjectsActions poa = new PageObjectsActions();


    @BeforeClass
   public static void setUp() {

        Configuration.timeout = 35000;
        Configuration.browserSize = ("1920x1080"); // |

    }

    @Test
    @Description(value = "Example usage of Selenide with Allure and JUnit")
    @Severity(value = SeverityLevel.CRITICAL)
    @TestCaseId(" ^_^ ")

    public void JMartSmokeTest() {

        poa.authorization();
        poa.ordersModule();
        poa.accountStatementModule();
        poa.productsModule();
        poa.settingsModule();

    }
    @After
    public void ScreenshotForReport() {
        if (WebDriverRunner.hasWebDriverStarted() != false) {
            SaveScreenshot();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] SaveScreenshot() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }



    @AfterClass
    public static void quitWebDriver() {
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.closeWebDriver();
    }
}
