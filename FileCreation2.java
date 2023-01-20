//Creating Files using File.createFile Method in JAVA

import java.io.*;
import java.nio.file.*;

class FileCreation2
{
	public static void main (String args[])
	{
		try
		{
			Path pf = Paths.get ("E:\\JAVA\\TRY\\FileDemo3.txt");
			Path p = File.createFile(pf);
			System.out.println ("File is created at ; " +pf);
		}
		catch (IOException e) { System.out.println (e); }
	}
}