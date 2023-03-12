package theinternet_automation.horizontalSlider;

import lombok.SneakyThrows;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import theinternet_automation.PageObject;
import theinternet_automation.geolocation.GeolocationPageVerify;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;

import static org.testng.AssertJUnit.assertTrue;

public class HorizontalSliderPageAct extends PageObject {

    HorizontalSliderPageVerify horizontalSliderPageVerify = new HorizontalSliderPageVerify(driver);
    HorizontalSliderPageWebElements horizontalSliderPageWebElements = new HorizontalSliderPageWebElements(driver);

    //Constructor
    public HorizontalSliderPageAct(WebDriver driver) {
        super(driver);
    }

    public HorizontalSliderPageAct openHorizontalSliderPage() {
        driver.navigate().to("https://the-internet.herokuapp.com/horizontal_slider");
        return this;
    }

    public HorizontalSliderPageAct clickOnSlider() {
        /***
         * Just doing the .click() will click in the middle of a slider, so I'm using the Actions()
         */
        Actions actions = new Actions(driver);
        actions.moveToElement(horizontalSliderPageWebElements.slider());
        actions.build().perform();
        return this;
    }


    public HorizontalSliderPageAct pressRightArrowButton(int times) {
        for (int i = 0; i < times; i++) {
            horizontalSliderPageWebElements.slider().sendKeys(Keys.ARROW_RIGHT);
        }
        return this;
    }

    public HorizontalSliderPageAct checkIfSliderIndicatesCorrectValue(int expectedSliderValue) {
        /***
         * One arrow click move the slider by 0.5, so 4 right arrows in a row should set the slider value to 2
         */
        assertTrue(horizontalSliderPageVerify.isSliderIndicatingCorrectValue(expectedSliderValue));
        return this;
    }
}
