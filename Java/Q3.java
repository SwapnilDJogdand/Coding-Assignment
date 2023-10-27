import java.io.*;

class CheckPangramOrNot
{
    public static boolean checkPangram(String str)
	{
		boolean[] mark = new boolean[26];

		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i)
				&& str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';

			else if ('a' <= str.charAt(i)
					&& str.charAt(i) <= 'z')

				index = str.charAt(i) - 'a';

			else
				continue;
			mark[index] = true;
		}

		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return (false);

		return (true);
	}
}

class Q3 {
	public static void main(String[] args)
	{
        CheckPangramOrNot cobj = new CheckPangramOrNot();

		String str
			= "Two driven jocks help fax my big quiz";

		if (cobj.checkPangram(str) == true)
			System.out.print(str + " \nString is a pangram.");
		else
			System.out.print(str + " \nString is not pangram.");
	}
}
