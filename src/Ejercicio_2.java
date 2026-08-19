import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        WebElement encabezado = driver.findElement(By.tagName("h1"));

        String texto = encabezado.getText();

        System.out.println("Texto encontrado: " + texto);

        if (texto.equals("Example Domain")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
