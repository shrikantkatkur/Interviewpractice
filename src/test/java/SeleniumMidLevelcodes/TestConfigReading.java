package SeleniumMidLevelcodes;

import java.io.IOException;

public class TestConfigReading {

	public static void main(String[] args) throws IOException {
		Config conf=new Config();
		System.out.println(conf.getAppUrl());
		System.out.println(conf.getBrowserName());
		System.out.println(conf.getEmail());
		System.out.println(conf.getPass());
		System.out.println(conf.getUserName());
			
	}

}
