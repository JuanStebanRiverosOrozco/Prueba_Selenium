import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_8 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement> casillas = driver.findElements(
                By.cssSelector("input[type='checkbox']")
        );

        WebElement segundaCasilla = casillas.get(1);

        if (segundaCasilla.isSelected()) {
            segundaCasilla.click();
        }

        if (!segundaCasilla.isSelected()) {
            System.out.println("La segunda casilla está desmarcada");
        } else {
            System.out.println("La segunda casilla está seleccionada");
        }

        driver.quit();
    }
}
