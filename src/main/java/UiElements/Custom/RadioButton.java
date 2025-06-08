package UiElements.Custom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.driverManger;
//
// size
public class RadioButton {
    By locater;
    WebDriver driver;
    String chosenSize; //xs , s
    public RadioButton(By locater) {
        this.locater = locater;
        this.driver = driverManger.getDriver();
    }

    //select() — clicks the radio button if not already selected.
    //
    //isSelected() — returns true/false if the radio button is selected.
    //
    //isEnabled() — returns true/false if enabled.
    //
    //Optional: getLabel() if you want to get the associated label text.
}
