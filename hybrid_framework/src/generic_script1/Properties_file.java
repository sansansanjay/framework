package generic_script1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

import org.testng.annotations.Test;

public class Properties_file {
	@Test
	public static void mul() throws FileNotFoundException, IOException 
	{
	 Properties p=new Properties();
	     FileOutputStream out = new FileOutputStream("C:\\Users\\sansa\\eclipse-workspace\\Hybrid framework\\src\\generic_script1\\File.prperties");
	  p.setProperty("sanjay","janavary");
	  p.store(out,  null);
			  
	
	
	
	
		
	}

}
