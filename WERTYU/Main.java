import com.acm.helper.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
	private static final String KEYBOARD = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
	
	// Things to add:
	/*

	1. Handle for the spaces (basically, spaces stay spaces)
	2. Handle edge cases (test all of them)
	3. Emulate "System.in" using a file
	4. (Separately) Develop some good test files (ie ones with lots of repeated lines, etc to showcase the caching improvement)

	*/
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		List<String> correctedLines = new ArrayList<String>();
		if(input.hasNext())//while(input.hasNext())
		{
			String correctedLine = "";
			String currentLine = input.nextLine();
			for(int i = 0; i < currentLine.length(); i++)
			{
				for(int j = 0; j < KEYBOARD.length(); j++)
				{
					Character entered = currentLine.charAt(i);
					
					if(entered.charValue() != ' ')
					{
						Character keyboardKey = KEYBOARD.charAt(j);

						boolean equal = (entered.charValue() == keyboardKey.charValue());
					
						if(equal)
						{
							correctedLine += KEYBOARD.charAt(j - 1);
						}	

						System.out.println(entered.charValue() + " == " + keyboardKey.charValue()  + " ? " + equal);
					}
					else
					{
						correctedLine += " ";
					}
				}
			}
			correctedLines.add(correctedLine);
		}

		for(int k = 0; k < correctedLines.size(); k++)
			System.out.println(correctedLines.get(k));
	}
}
