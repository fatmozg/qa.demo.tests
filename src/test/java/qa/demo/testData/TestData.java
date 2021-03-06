package qa.demo.testData;

import com.github.javafaker.Faker;

import java.io.File;

import static java.util.Collections.replaceAll;

public class TestData {
    static Faker faker = new Faker();
    public static String
            registrationFormUrl = "/automation-practice-form",
            textOfHeader = "Student Registration Form",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            number = faker.phoneNumber().cellPhone(),
            subject1 = "Computer Science",
            subject2 = "English",
            subject3 = "Maths",
            dayOfBD = String.valueOf(faker.random().nextInt(1, 28)),
            yearOfBD = String.valueOf(faker.random().nextInt(1900, 2100)),
            address = faker.address().fullAddress(),
            picturePath = "/Users/macbook/Downloads/1633494326172317030.jpg";

    public static File picture = new File(picturePath);
}
