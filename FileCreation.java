// Creating Files using createNewFile() Method in JAVA

import java.io.*;

class FileCreation
{
	public static void main (String args[])
	{
		try
		{
			File fc = new File ("E:\\JAVA\\TRY\\FileDemo.txt");
			boolean f = fc.createNewFile();
			if (f)
			{
				System.out.println ("File Created");
			}
			else
			{
				System.out.println ("File Not Created");
			}
		}
		catch (IOException e) { System.out.println (e); }
	}
}