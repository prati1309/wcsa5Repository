package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDtataProperty {

	public static void main(String[] args) throws IOException {
		// 
		
		FileInputStream fis=new FileInputStream("./data/config.properties");
		
		//create a obj of property class
		Properties prop=new Properties();
		
		//make a file ready for read
		 prop.load(fis);
		 
		 //read the particular property
		 String data=prop.getProperty("username");
		 System.out.println(data);
		
		

	}

}
