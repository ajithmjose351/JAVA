// Creating Files using FileOutputStream class , Method in JAVA

import java.io.*;

class FileCreation1
{
	public static void main (String args[])
	{
		try
		{
			FileOutputStream fc = new FileOutputStream ("E:\\JAVA\\TRY\\FileDemo1.txt");
			System.out.println ("File Created");
		}
		catch (IOException e) { System.out.println (e); }
	}
}