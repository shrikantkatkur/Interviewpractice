package SeleniumMidLevelcodes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import utilities.PropUtil;

public class Config {

	public String readProperty(String property)  {
		String basedir = System.getProperty("user.dir");
		String filepath=basedir + "/src/main/resources/config.properties";
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filepath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Properties prop=new Properties();
		
		try {
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String value=prop.getProperty(property);
		 
		return value;
	}

	public String getBrowserName()  {
		return readProperty("browser_name");
	}

	public String getAppUrl()  {
		return readProperty("app_url");
	}

	public String getEmail()  {
		return readProperty("email");
	}

	public String getUserName()  {
		return readProperty("userName");
	}
	public String getPass()  {
		return readProperty("password");
	}

}
