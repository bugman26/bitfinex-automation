package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
	public Properties init_prop() {
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}

	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		ConfigReader.prop = prop;
	}


//
////	public static Properties getProp() {
////		return prop;
////	}
////
////	public static void setProp(Properties prop) {
////		ConfigReader.prop = prop;
////	}
	
//	public void setProp(Properties prop) {
//		this.prop = prop;
//	} 
//	
//	public Properties getProp() {
//		return prop;
//	}

}
