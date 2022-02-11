package qa.demo.pages.components;

import com.codeborne.selenide.SelenideElement;

import java.text.DateFormatSymbols;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static qa.demo.testData.TestData.dayOfBD;
import static qa.demo.testData.TestData.yearOfBD;

public class CalendarComponent {
    public void setBirthdayDate () {
        Random random = new Random();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();

        // Random month
        String[] monthsArr = dateFormatSymbols.getMonths();
        int randomIndexForMonth = random.nextInt(monthsArr.length);
        String monthOfBD = monthsArr[randomIndexForMonth];


        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(monthOfBD);
        $(".react-datepicker__year-select").selectOption(yearOfBD);
        SelenideElement elementOfDay = $(".react-datepicker__month").$(byText(dayOfBD));
        elementOfDay.click();
    }
}
