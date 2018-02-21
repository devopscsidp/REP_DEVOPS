package Devops_task.devops;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {	
    	Logger LOG = LoggerFactory.getLogger(App.class);

        String dirPath = args[0];// in.nextLine();
    	//String dirPath = "C:\\Metadata";
    	File dir = new File(dirPath);
    	String[] files = dir.list();
    	if (files.length == 0) {
    		LOG.info("The directory is empty");
    	} else {
    	    for (String aFile : files) {
    	    	LOG.info(aFile);
    	    }
    	}
    }
}