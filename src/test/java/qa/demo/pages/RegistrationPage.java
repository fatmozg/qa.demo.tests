package qa.demo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static qa.demo.testData.TestData.*;

public class RegistrationPage {
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName").setValue(firstName),
            lastNameInput = $("#lastName").setValue(lastName),
            emailInput = $("#userEmail").setValue(email),
            phoneNumberInput = $("#userNumber").setValue(phone),
            subjectSelect = $("#subjectsContainer"),
            subjectInput = $("#subjectsInput").setValue(subject);
}
