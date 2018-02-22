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

        //String dirPath = args[0];// in.nextLine();
    	String dirPath = "//root";
    	
    	File dir = new File(dirPath);
    	String[] files = dir.list();
    	if (files.length == 0) {
    		System.out.println("The directory is empty");
    	} else {
    	    for (String aFile : files) {
    	    	System.out.println(aFile);
    	    }
    	}
    }
}