package Batch129.Pages.pages;

import Batch129.Utilis.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
;

public class GooglePage {
    public  GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@name='q']")
    public WebElement aramaKutusu;
}
