package qa.demo.pages.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Math.random;

public class GenderComponent {
    public void selectGender() {
        List<String> listOfGender = new ArrayList<String>();
        listOfGender.add("Male");
        listOfGender.add("Female");
        listOfGender.add("Other");
        Random random = new Random();
        int randomGender = random.nextInt(listOfGender.size());
        String gender = listOfGender.get(randomGender);

        $(byText(gender)).click();
    }
}
