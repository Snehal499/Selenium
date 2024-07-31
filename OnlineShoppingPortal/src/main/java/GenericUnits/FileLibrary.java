package GenericUnits;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileLibrary {
	
	public String fatchDataFromProperties(String path, String Key) {
		File f=new File(path);
		Properties prop=null;
		
		try {
		FileInputStream fis=new FileInputStream(f);
		prop=new Properties();
		prop.load(fis);
		}
		
		catch(Exception e) {
			
		}
		
		String data = prop.getProperty(Key);
		return data;
	}
}
