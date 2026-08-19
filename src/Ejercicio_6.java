import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_6 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement campo = driver.findElement(By.tagName("input"));

        campo.sendKeys("20");

        String primerValor = campo.getAttribute("value");

        System.out.println("Primer valor: " + primerValor);

        campo.clear();

        campo.sendKeys("35");

        String segundoValor = campo.getAttribute("value");

        System.out.println("Segundo valor: " + segundoValor);

        if (segundoValor.equals("35")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
