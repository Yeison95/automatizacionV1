package com.enviopack.driver;

import com.enviopack.enums.Browser;

public class DriverManagerFactory {

	public static IDriverManager getManager(Browser browser) {

		switch (browser) {
		
		case CHROME : {
			return new DriverManagerChrome();
		}
		case FIREFOX : {
			return new DriverManagerFirefox();
		}
		case EDGE : {
			return new DriverManagerEdge();
		}
		case SAFARI : {
			return new DriverManagerSafari();
		}
		default : throw new IllegalArgumentException("Invalid Driver: " + browser);	
		}
	}

}