package qa.demo.tests;

import org.junit.jupiter.api.Test;
import qa.demo.pages.RegistrationPage;
import qa.demo.testData.TestBase;

import java.io.IOException;

import static qa.demo.testData.TestData.*;

public class RegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillRegistrationForm() throws IOException {
        registrationPage.checkHeader();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.selectGender();
        registrationPage.inputNumber(number);
        registrationPage.setDateOfBirthday();
        registrationPage.inputSubject(subject1);
        registrationPage.inputSubject(subject2);
        registrationPage.inputSubject(subject3);
        registrationPage.selectHobby();
        registrationPage.uploadPicture(picture);
        registrationPage.inputAddress(address);
        registrationPage.selectStateAndCity();
        registrationPage.submitRegistrationForm();
    }

    @Test
    void checkRegistrationOutput() {

    }
}


