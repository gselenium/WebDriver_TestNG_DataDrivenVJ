package Rough;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadObjectProperties {
	public static void main(String[] args) throws Exception {
		//create object for properties
		Properties OR=new Properties();
		//create object for fileinputstream
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/com/gktech/config/OR.properties");
		//load the file in the properties file
		
		OR.load(ip);
		System.out.println(OR.getProperty("loglink"));
		System.out.println(OR.getProperty("logbutton"));
		//create object for properties
		Properties CONFIG=new Properties();
		//create object for fileinputstream
		FileInputStream cp=new FileInputStream(System.getProperty("user.dir")+"/src/com/gktech/config/config.properties");
		//load the file in the properties file
		CONFIG.load(cp);
		System.out.println(CONFIG.getProperty("browsertype"));
		
		System.out.println(System.getProperty("user.dir"));
	}
}
