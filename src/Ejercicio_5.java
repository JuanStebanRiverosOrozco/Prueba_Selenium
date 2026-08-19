import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_5 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement campo = driver.findElement(By.tagName("input"));

        campo.sendKeys("50");

        String valor = campo.getAttribute("value");

        System.out.println("Valor ingresado: " + valor);

        if (valor.equals("50")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
