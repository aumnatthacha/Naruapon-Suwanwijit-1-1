import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class Edgetest {

	@Test
	void test() {
		
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\YEAR 2 TERM 2\\T.Naruphon\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://www.google.com");
		//driver.quit(); //ออกจากEdge
	
	}

}
