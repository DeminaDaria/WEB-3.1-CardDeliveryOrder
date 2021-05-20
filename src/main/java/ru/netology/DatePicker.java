package ru.netology;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePicker {
    public String dateCalendar () {
        LocalDate date = LocalDate.now().plusDays(3);
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public String dateCalendar2 () {
        LocalDate date = LocalDate.now().plusDays(2);
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
