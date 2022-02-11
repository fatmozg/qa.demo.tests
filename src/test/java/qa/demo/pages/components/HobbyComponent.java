package qa.demo.pages.components;

import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HobbyComponent {
    public void selectHobby() {
        String[] hobbiesArr = new String[3];
        hobbiesArr[0] = "Sports";
        hobbiesArr[1] = "Reading";
        hobbiesArr[2] = "Music";

        Random random = new Random();
        int indexOfRandomHobby = random.nextInt(hobbiesArr.length);
        String hobby = hobbiesArr[indexOfRandomHobby];
        SelenideElement searchHobby = $("#hobbiesWrapper").$(byText(hobby));
        searchHobby.click();
    }
}
