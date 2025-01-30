package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 FileReader fr = new FileReader("C:\\Users\\DnyaneshwarShinde\\Desktop\\Selenium Automation\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		 Properties p = new Properties();
		 p.load(fr);
		 
		 FileReader fr1 = new FileReader("C:\\Users\\DnyaneshwarShinde\\Desktop\\Selenium Automation\\TestAutomationFramework\\src\\test\\resources\\configfiles\\locators.properties");
		 Properties q = new Properties();
		 q.load(fr1);
	}

}
