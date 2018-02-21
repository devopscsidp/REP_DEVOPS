package Devops_task.devops;

import java.io.File;

import org.apache.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {	
    	final Logger logger = Logger.getLogger(App.class);

        String dirPath = args[0];// in.nextLine();
    	//String dirPath = "C:\\Metadata";
    	File dir = new File(dirPath);
    	String[] files = dir.list();
    	if (files.length == 0) {
    		logger.info("The directory is empty");
    	} else {
    	    for (String aFile : files) {
    	    	logger.info(aFile);
    	    }
    	}
    }
}