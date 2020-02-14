package com.corejavaprograms;

import java.io.*;

public class FileHanding {

	public static void main(String[] args) {
		
		try
		{
			
			File rd =new File("C:\\Users\\ravi.gohil\\Desktop\\file1.txt");
    	    File wr =new File("C:\\Users\\ravi.gohil\\Desktop\\file2.txt");
    	    
    	    FileInputStream fin = new FileInputStream(rd);
    	    FileOutputStream writ = new FileOutputStream(wr);
			
    	    int c;
    	    int length;
    	    byte buffer[]=new byte[1024];
    	    
    	    while((length=fin.read(buffer))>0)
    	    {
    	    	writ.write(buffer);
    	    }
    	    fin.close();
    	    writ.close();
	   System.out.println("File copied");
	   }
		catch(Exception e)
		{
			
		}	
	}
}
