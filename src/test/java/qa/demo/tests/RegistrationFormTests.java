package qa.demo.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class RegistrationFormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2500x1700";
    }

    @Test
    void fillRegistrationForm() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue("Ilia");
        $("#lastName").setValue("Khokhlov");
        $("#userEmail").setValue("ikh@twt.it");
        $(byText("Male")).click();
        $("#userNumber").setValue("39329758888");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(5);
        $(".react-datepicker__year-select").selectOption("1994");
        $(byXpath("//*[@class='react-datepicker__day react-datepicker__day--019 react-datepicker__day--weekend']")).click();
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


