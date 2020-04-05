import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static AndroidDriverManager driverManager;
    static AndroidDriver driver;
    private LoginLayout loginLayout;

    @BeforeClass
    public static void prepareTest() {

        driverManager = new AndroidDriverManager();
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Before
    public void initPageObject() {
        loginLayout = new LoginLayout(driver);
    }

    @Test
    public void test() throws InterruptedException {
        loginLayout.enterEmailAndPassword("loging@login.com", "loging");
        Thread.sleep(5000);
    }

}
