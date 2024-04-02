import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PositiveTest {

    @BeforeEach
    void setup() {open("http://localhost:8080");
    }
    @Test
    void shouldBePurchaseATourUsingAValidCard(){

    }
}
