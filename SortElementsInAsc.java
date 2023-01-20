import java.io.*;

class SortElementsInAsc
{
	public static void main (String args [])
	{
		String str;
		int a[], n, i, j, temp;
		try
		{
			DataInputStream dis = new DataInputStream (System.in);
			System.out.println ("Enter the size of the Array: ");
			str = dis.readLine();
			n = Integer.parseInt (str);
			System.out.println ("Enter the " +n+ " Elements;");
			a = new int[n];
			for (i=0; i<n; i++)
			{
				str = dis.readLine();
				a[i] = Integer.parseInt(str);
			}
			//System.out.println ("The Array Elements are;");
			//for (i=0; i<n; i++)
			//{
				//System.out.println (+a[i]);
			//}
			System.out.println ("After Sorting Elements are;");
			for (i=0; i<n; i++)
			{
				for (j=i+1; j<n; ++j)
				{
					if (a[i] > a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (i=0; i<n; i++)
			{
				System.out.println (a[i]);
			}
		}
		catch (IOException e){System.out.println ("Error" +e);}
	}
}