package day01;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class openliu {
	@Test
	public void open() throws InterruptedException {
		//打开火狐浏览器
//		System.setProperty("webdriver.firfox.bin", "D:\\Firefox12\\firefox.exe");
//		WebDriver driver = new FirefoxDriver();
		//打开IE浏览器
//		System.setProperty("webdriver.ie.driver", "./tools/IEDriverServer.exe");
//		WebDriver driver = new IEDriverServer();
		//打开谷歌浏览器
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url1 = "https://www.baidu.com";
		String url2 = "https://www.v2ex.com";
		//第一种方式打开网址
		driver.get(url1);
		
		//浏览器窗口最大化
		driver.manage().window().maximize();

		//第二种方式打开网址
		driver.navigate().to(url2);
		
		//控制浏览器窗口大小
		Dimension dimension = new Dimension(900, 800);
		driver.manage().window().setSize(dimension);
		
		//后退页面
		driver.navigate().back();
		
		//获取当前页面标题
		String title1 = driver.getTitle();
		//打印标题
		System.out.println(title1);
		
		//获取当前url
		String url11 = driver.getCurrentUrl();
		//打印url
		System.out.println(url11+"\n");
		
		//暂停页面
		Thread.sleep(100);
		
		//前进页面
		driver.navigate().forward();
		
		//获取当前页面标题
		String title2 = driver.getTitle();
		//打印标题
		System.out.println(title2);
		
		//获取当前url
		String url12 = driver.getCurrentUrl();
		//打印url
		System.out.println(url12);
		
		//浏览器刷新
		driver.navigate().refresh();
		
	}
}
