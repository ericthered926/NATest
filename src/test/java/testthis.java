import org.testng.annotations.Test;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.open;

public class testthis{

    @Test
    public void searchWithGoogle() {
        open("http://google.com");
        System.out.print("hello");
    }
}