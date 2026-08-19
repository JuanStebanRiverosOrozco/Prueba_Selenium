import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejercicio_9 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement lista = driver.findElement(By.id("dropdown"));

        Select select = new Select(lista);

        select.selectByVisibleText("Option 1");

        WebElement opcionSeleccionada = select.getFirstSelectedOption();

        String texto = opcionSeleccionada.getText();

        System.out.println("Opción seleccionada: " + texto);

        if (texto.equals("Option 1")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
