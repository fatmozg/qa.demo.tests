package qa.demo.pages;

import com.codeborne.selenide.SelenideElement;
import qa.demo.pages.components.CalendarComponent;
import qa.demo.pages.components.GenderComponent;
import qa.demo.pages.components.HobbyComponent;
import qa.demo.pages.components.StateAndCityComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static qa.demo.testData.TestData.*;

public class RegistrationPage {
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName").setValue(firstName),
            lastNameInput = $("#lastName").setValue(lastName),
            emailInput = $("#userEmail").setValue(email),
            numberInput = $("#userNumber").setValue(number),
            subjectSelector = $("#subjectsContainer"),
            addressInput = $("#currentAddress").setValue(address),
            pictureButton = $("#uploadPicture"),
            submitButton = $("#submit");

    GenderComponent genderComponent = new GenderComponent();
    CalendarComponent calendarComponent = new CalendarComponent();
    HobbyComponent hobbyComponent = new HobbyComponent();
    StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();

    public void checkHeader() {
        formTitle.shouldHave(text(textOfHeader));
    }

    public void inputFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void inputLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void inputEmail(String value) {
        emailInput.setValue(value);
    }

    public void selectGender() {
        genderComponent.selectGender();
    }

    public void inputNumber(String value) {
        numberInput.setValue(value.replaceAll("[^0-9]", ""));
    }

    public void setDateOfBirthday() {
        calendarComponent.setBirthdayDate();
    }

    public void inputSubject(String value) {
        subjectSelector.click();
        $("#subjectsInput").setValue(value).pressEnter();
    }

    public void selectHobby() {
        hobbyComponent.selectHobby();
    }

    public void uploadPicture(File value) throws java.io.IOException {
        pictureButton.uploadFile(value);
    }

    public void inputAddress(String value) {
        addressInput.setValue(value);
        $("#submit").scrollIntoView(true);
    }

    public void selectStateAndCity() {
        stateAndCityComponent.selectStateAndCity();
    }

    public void submitRegistrationForm() {
        submitButton.click();
    }
}
