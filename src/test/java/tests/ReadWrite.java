package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		// read data from property file
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\ReadDataFromPropertyFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		System.out.println( properties.getProperty("browser"));
		System.out.println( properties.getProperty("url"));
		
		// to write testdata in properties file
		FileOutputStream outputstream = new FileOutputStream("C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\ReadDataFromPropertyFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata", "123456");
		properties.store(outputstream, "This is testdata from customer");
		
		// read back
		System.out.println(properties.getProperty("testdata"));
		
		
	}

}
