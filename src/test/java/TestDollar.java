import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;
// Hello, World!!
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// Аня, привет!
public class TestDollar {
    @Test
    void MyOne() {
        open("http://92.51.36.108:7777/top.academy/xpath/v01/");
        sleep(50000);
        $("body > form > div:nth-child(1) > input[type=text]").setValue("100");
        $("[type=submit]").click();
        $("#sum").shouldHave(text("100"));
        $(byText("Вы внесли 100 рублей")).shouldBe(exist);

    }
    @Test
    void MyTwo() {
        open("http://92.51.36.108:7777/top.academy/xpath/v01/");
        sleep(50000);
        $("body > form > div:nth-child(3) > input[type=text]").setValue("100");
        $("body > form > input[type=submit]").click();
        $(byText("Вы внесли 100 долларов")).shouldBe(exist);
}
    @Test
    void MyT() {
        open("http://92.51.36.108:7777/top.academy/xpath/v01/");
        sleep(50000);
        $("body > form > div:nth-child(5) > input[type=text]").setValue("100");
        $("body > form > input[type=submit]").click();
        $(byText("Вы внесли 100 евро")).shouldBe(exist);

}
}





