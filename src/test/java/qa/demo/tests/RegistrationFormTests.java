package qa.demo.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import qa.demo.pages.RegistrationPage;
import qa.demo.testData.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
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
        sleep(10000);
        /*$("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(5);
        $(".react-datepicker__year-select").selectOption("1994");
        $(byXpath("//*[@class='react-datepicker__day react-datepicker__day--019 react-datepicker__day--weekend']")).click();*/
        $("#subjectsContainer").click();
        $("#subjectsInput").setValue("My subject");
        $(byText("Sports")).click();
        $("#currentAddress").setValue("Current Address");
        $("#submit").scrollIntoView(true);
        $("#state").click();
        $("#react-select-3-option-1").click();
        $("#city").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();
        sleep(10000);
    }
}


