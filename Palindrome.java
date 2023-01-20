import java.io.*;

class Palindrome
{
	public static void main (String args[])
	{
		int x;
		String str;
		DataInputStream dis = new DataInputStream (System.in);
		try
		{
			System.out.println ("Enter a Number: ");
			str = dis.readLine();
			x = Integer.parseInt (str);
			test t = new test();
			t.check (x);
		}
		catch (IOException e) {System.out.println ("ERROR" +e);}
	}
}

class test
{
	public int check (int num)
	{
		int str = num;
		if (str == reverse (str))
		{
			System.out.println ("Palindrome");
			return 1;
		}
		else
		{
			System.out.println ("Not Palindrome");
			return 0;
		}
	}
	public int reverse (int num)
	{
		int rev=0, rem=0;
		while (num>0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		return rev;
	}
}