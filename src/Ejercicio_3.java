import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement enlace = driver.findElement(By.linkText("Inputs"));

        enlace.click();

        WebElement encabezado = driver.findElement(By.tagName("h3"));

        String texto = encabezado.getText();

        System.out.println("Encabezado encontrado: " + texto);

        if (texto.equals("Inputs")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
