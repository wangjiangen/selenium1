package day01;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class openliu {
	@Test
	public void open() throws InterruptedException {
		//�򿪻�������
//		System.setProperty("webdriver.firfox.bin", "D:\\Firefox12\\firefox.exe");
//		WebDriver driver = new FirefoxDriver();
		//��IE�����
//		System.setProperty("webdriver.ie.driver", "./tools/IEDriverServer.exe");
//		WebDriver driver = new IEDriverServer();
		//�򿪹ȸ������
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url1 = "https://www.baidu.com";
		String url2 = "https://www.v2ex.com";
		//��һ�ַ�ʽ����ַ
		driver.get(url1);
		
		//������������
		driver.manage().window().maximize();

		//�ڶ��ַ�ʽ����ַ
		driver.navigate().to(url2);
		
		//������������ڴ�С
		Dimension dimension = new Dimension(900, 800);
		driver.manage().window().setSize(dimension);
		
		//����ҳ��
		driver.navigate().back();
		
		//��ȡ��ǰҳ�����
		String title1 = driver.getTitle();
		//��ӡ����
		System.out.println(title1);
		
		//��ȡ��ǰurl
		String url11 = driver.getCurrentUrl();
		//��ӡurl
		System.out.println(url11+"\n");
		
		//��ͣҳ��
		Thread.sleep(100);
		
		//ǰ��ҳ��
		driver.navigate().forward();
		
		//��ȡ��ǰҳ�����
		String title2 = driver.getTitle();
		//��ӡ����
		System.out.println(title2);
		
		//��ȡ��ǰurl
		String url12 = driver.getCurrentUrl();
		//��ӡurl
		System.out.println(url12);
		
		//�����ˢ��
		driver.navigate().refresh();
		
	}
}
