package Devops_task.devops;

import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {	
    	//Scanner in = new Scanner(System.in);
        String dirPath = args[0];// in.nextLine();
    	//String dirPath = "C:\\Metadata";
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