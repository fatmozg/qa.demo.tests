package qa.demo.pages.components;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setBirthdayDate () {
        Random random = new Random();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();

        String randomDay = String.valueOf(Math.floor(Math.random() * 28) + 1);
        List<String> monthsList = Arrays.asList(dateFormatSymbols.getMonths());
        String randomMonth = String.valueOf(random.nextInt(monthsList.size()));;
        String randomYear = String.valueOf(Math.floor(Math.random() * 2004) + 1950);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(randomMonth);
        $(".react-datepicker__year-select").selectOption(randomYear);

        String selector = "\"//*[@class='react-datepicker__day react-datepicker__day--0%s react-datepicker__day--weekend']\"";
        String formatedSelector = String.format(selector,randomDay);
        $(byXpath(selector)).click();
    }
}
