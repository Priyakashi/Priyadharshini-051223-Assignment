package Variables;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class configProperties  {
	
	public static Properties property;
	private static String configpath = "Configuration/configsetting.properties";
	
	public static String readCondif(String config) throws IOException
	{
		property = new Properties();
	
			InputStream instrm = new FileInputStream(configpath);
			property.load(instrm);
			String value=(String) property.get(config);
		//	System.out.println(property.get("User_name"));
		
			
			
		return value;
	}

	
}
