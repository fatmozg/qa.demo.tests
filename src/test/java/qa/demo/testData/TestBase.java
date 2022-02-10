package qa.demo.testData;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static qa.demo.testData.TestData.registrationFormUrl;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserVersion = "96";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2400x1600";
        open(registrationFormUrl);
    }

}
