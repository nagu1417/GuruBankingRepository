package ConfigPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config {
	Properties pro=new Properties();
	public Config() throws Exception
	{
		File configFile=new File("F:\\Selenium Workspace\\GuruBanking\\src\\ConfigPackage\\configReader.properties");
		FileInputStream fi=new FileInputStream(configFile);
		
		pro.load(fi);
	}

	public String getData(String strText)
	{
		
		return pro.getProperty(strText);
	}
}
