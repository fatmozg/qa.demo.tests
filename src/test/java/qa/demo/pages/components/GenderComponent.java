package qa.demo.pages.components;

import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GenderComponent {
    public void selectGender() {
        // Genders array
        String[] gendersArr = new String[3];
        gendersArr[0] = "Male";
        gendersArr[1] = "Female";
        gendersArr[2] = "Other";
        Random random = new Random();
        int indexOfRandomGender = random.nextInt(gendersArr.length);
        String gender = gendersArr[indexOfRandomGender];
        // Select gender
        $(byText(gender)).click();
    }
}
