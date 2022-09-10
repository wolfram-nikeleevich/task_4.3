package ru.netology;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbackTest {

    @Test
    public void test() {
        open("http://localhost:9999");
        $("[type=\"text\"]").setValue("Андрей");
        $("[type=\"tel\"]").setValue("+79876543210");
        $(".checkbox__text").click();
        $(".button__text").click();
        $(withText("Ваша заявка успешно отправлена!")).should(visible);
    }
}
