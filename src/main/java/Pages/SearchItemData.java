package Pages;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.io.IOException;

public class SearchItemData {

    WebDriver driver;

    @FindBy(xpath = "//input[@class='col-xs-20 searchformInput keyword']")
    WebElement itemSearch;

    @FindBy(css = "span.searchTextSpan")
    WebElement SearchButton;

    public SearchItemData(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement enterItemInSearch() {
        return itemSearch;
    }

    public WebElement ClickSearchButton() {
        return SearchButton;
    }
}


