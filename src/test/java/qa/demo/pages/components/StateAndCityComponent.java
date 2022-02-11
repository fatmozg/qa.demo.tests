package qa.demo.pages.components;

import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityComponent {
    public void selectStateAndCity() {
        // States and cities
        String[] stateArr = new String[4];
        stateArr[0] = "NCR";
        stateArr[1] = "Uttar Pradesh";
        stateArr[2] = "Haryana";
        stateArr[3] = "Rajasthan";

        String[] cityOfNCRArr = new String[3];
        cityOfNCRArr[0] = "Delhi";
        cityOfNCRArr[1] = "Gurgaon";
        cityOfNCRArr[2] = "Noida";

        String[] cityOfUttarPradeshArr = new String[3];
        cityOfUttarPradeshArr[0] = "Agra";
        cityOfUttarPradeshArr[1] = "Lucknow";
        cityOfUttarPradeshArr[2] = "Merrut";

        String[] cityOfHaryanaArr = new String[2];
        cityOfHaryanaArr[0] = "Karnal";
        cityOfHaryanaArr[1] = "Panipat";

        String[] cityOfRajasthanArr = new String[2];
        cityOfRajasthanArr[0] = "Jaipur";
        cityOfRajasthanArr[1] = "Jaiselmer";

        // State select
        Random random = new Random();
        int indexOfRandomState = random.nextInt(stateArr.length);
        String state = stateArr[indexOfRandomState];
        SelenideElement stateElement = $("#state").$(byText(state));
        stateElement.click();

        //City select
        if ((stateArr[0]) == state) {
            int indexOfRandomCity = random.nextInt(cityOfNCRArr.length);
            String cityOfNCR = cityOfNCRArr[indexOfRandomCity];
            SelenideElement cityOfNCRElement = $("#city").$(byText(cityOfNCR));
            cityOfNCRElement.click();
        } else if ((stateArr[1]) == state) {
            int indexOfRandomCity = random.nextInt(cityOfUttarPradeshArr.length);
            String cityOfUttarPradesh = cityOfUttarPradeshArr[indexOfRandomCity];
            SelenideElement cityOfUttarPradeshElement = $("#city").$(byText(cityOfUttarPradesh));
            cityOfUttarPradeshElement.click();
        } else if ((stateArr[2]) == state) {
            int indexOfRandomCity = random.nextInt(cityOfHaryanaArr.length);
            String cityOfHaryana = cityOfHaryanaArr[indexOfRandomCity];
            SelenideElement cityOfHaryanaElement = $("#city").$(byText(cityOfHaryana));
            cityOfHaryanaElement.click();
        } else if ((stateArr[3]) == state) {
            int indexOfRandomCity = random.nextInt(cityOfRajasthanArr.length);
            String cityOfRajasthan = cityOfRajasthanArr[indexOfRandomCity];
            SelenideElement cityOfRajasthanElement = $("#city").$(byText(cityOfRajasthan));
            cityOfRajasthanElement.click();
        }
    }
}
