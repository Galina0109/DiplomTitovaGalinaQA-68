import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PositiveTest {

    @BeforeEach
    void setup() {
        open("http://localhost:8080");
    }


    @Test
    void shouldBePurchaseATourUsingAValidCard() {
        $("button").click();
        $("[class='input__inner'] input").sendKeys("4444444444444441");
        $("[class='input-group__input-case'] input").sendKeys("04");
        $("[class='input input_type_text input_view_default input_size_m input_width_available input_has-label input_theme_alfa-on-white'] input").sendKeys("24");
        $("[class='input input_type_text input_view_default input_size_m input_width_available input_has-label input_theme_alfa-on-white'] input").sendKeys("PopovOlegViktorovich");
        $("[class='input input_type_text input_view_default input_size_m input_width_available input_has-label input_theme_alfa-on-white'] input").sendKeys("152");
        $("[class='form-field form-field_size_m form-field_theme_alfa-on-white'] button").click();
        $(byText("Отправляем запрос в Банк...")).shouldBe(visible, Duration.ofSeconds(15));
        $(byText("Успешно!")).shouldBe(visible);
        $("[class='notification__icon'] .notification__content")
                .shouldHave(exactText("Операция одобрена Банком."))
                .shouldBe(visible);
    }


    @Test
    void BuyingATourOnCreditWithValidData() {

        $("button").click();
    }
}

