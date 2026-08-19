import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");

        String titulo = driver.getTitle();

        System.out.println("Título de la página: " + titulo);

        if (titulo.contains("Example")) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        driver.quit();
    }
}
