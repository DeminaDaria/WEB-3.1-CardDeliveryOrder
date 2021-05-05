package ru.netology.web;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class DeliveryFormCardTest {
    @Test
    void shouldOrderCardSuccess() {
        open("http://localhost:9999");

        $("[data-test-id='city'] .input__control").setValue("Москва");
        $("[data-test-id='date'] .input__control").sendKeys(Keys.CONTROL + "a");
        $("[data-test-id='date'] .input__control").sendKeys(Keys.DELETE);
        $("[data-test-id='date'] .input__control").setValue("08.05.2021");
        $("[data-test-id='name'] .input__control").setValue("Иванов Иван");
        $("[data-test-id='phone'] .input__control").setValue("+79874563211");
        $("[data-test-id='agreement']").click();
        $$("button").find(exactText("Забронировать")).click();
        $(".notification__title").shouldHave(exactText("Успешно!"), Duration.ofSeconds(15));

    }
}
