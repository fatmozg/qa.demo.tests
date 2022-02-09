package qa.demo.testData;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            phone = faker.phoneNumber().cellPhone(),
            subject = faker.harryPotter().book();
}
