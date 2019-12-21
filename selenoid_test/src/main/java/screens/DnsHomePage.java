package screens;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class DnsHomePage {
    public void searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
    }
}
