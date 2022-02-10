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

        // Random month
        String[] monthsArr = dateFormatSymbols.getMonths();
        int randomIndexForMonth = random.nextInt(monthsArr.length);
        String month = monthsArr[randomIndexForMonth];

        // Random year
        int[] yearArr = new int[1000];
        for (int i = 1900; i < 2101; i++) {
            for (int j = 0; j < 1000; j++) {
                yearArr[j] = i;
            }
        }
        int randomIndexOfYear = random.nextInt(yearArr.length);
        int year = yearArr[randomIndexOfYear];

        // Random day
        int[] dayArr = new int[28];
        for (int i = 1; i < 29; i++) {
            for (int j = 0; j < 28; j++) {
                dayArr[j] = i;
            }
        }
        int randomIndexOfDay = random.nextInt(dayArr.length);
        int day = dayArr[randomIndexOfDay];


        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);

        String selector = "\"//*[@class='react-datepicker__day react-datepicker__day--0%s react-datepicker__day--weekend']\"";
        String formatedSelector = String.format(selector,day);
        $(byXpath(selector)).click();
    }
}
