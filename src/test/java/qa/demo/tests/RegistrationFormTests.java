package qa.demo.tests;

import org.junit.jupiter.api.Test;
import qa.demo.pages.RegistrationPage;
import qa.demo.testData.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static qa.demo.testData.TestData.*;

public class RegistrationFormTests extends TestBase {

RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillRegistrationForm() {
        registrationPage.checkHeader();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.selectGender();
        registrationPage.inputNumber(number);
        registrationPage.setDateOfBirthday();
        registrationPage.inputSubject(subject);
        registrationPage.selectHobby();
        registrationPage.inputAddress(address);
        $("#state").click();
        $("#react-select-3-option-1").click();
        $("#city").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();
        sleep(10000);
    }
}


