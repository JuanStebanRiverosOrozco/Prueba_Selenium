import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_7 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> casillas = driver.findElements(
                By.cssSelector("input[type='checkbox']")
        );

        WebElement primeraCasilla = casillas.get(0);

        if (!primeraCasilla.isSelected()) {
            primeraCasilla.click();
        }

        if (primeraCasilla.isSelected()) {
            System.out.println("Casilla seleccionada");
        } else {
            System.out.println("Casilla no seleccionada");
        }

        driver.quit();
    }
}
