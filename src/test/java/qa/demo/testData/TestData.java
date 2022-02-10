package qa.demo.testData;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    public static String
            registrationFormUrl = "/automation-practice-form",
            textOfHeader = "Student Registration Form",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            number = faker.phoneNumber().cellPhone(),
            subject = faker.harryPotter().book();
}
