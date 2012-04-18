#Problem Helper

Problem helper is a java package to help you manage input / output and testing of your solutions. The ACM Practice problems are far too lightweight to need any kind of JUnit testing, so this is a suitable replacement for that.

## Basics

##### Step One:

Add a test file to a practice problem, find (or create) the folder "InputOutput" which should be at the root of the problem folder. Inside the "Input" folder, add a text file with the input you'd like to test. Make sure you give the file a descriptive name. For instance the file that might contain the problem's stated sample input would be "SampleInput.txt" (.txt is not necessary, but the file should be plain text).

##### Step Two:

Add the folder "ProblemHelper" to your classpath. 

##### Step Three:

Add the following line to the top of your problem solution file (which should be "Main.java"):

    import com.acm.problemhelper;

Then, add the following code to your main function:

    public static void main(String[] args)
    {
		ProblemHelper helper = new ProblemHelper();
		Scanner input = helper.getInput(args);
		
		//... the rest of your code in here
	}

##### Step Four:

Run your code! Do the following for testing the sample input file as described in Step One:

	$ java Main SampleInput

Inside your `Main.java` file, the line `helper.getInput(args);`. Will read the input parameter `SampleInput`, find the SampleInput.txt file you created, and return a scanner with the file's contents.

Once you have that scanner, you can treat it as if it was a scanner defined by

	Scanner input = new Scanner(System.in);

If you don't provide an input parameter, and run something like this:

	java Main

Then the line `helper.getInput(args)` will return a Scanner with System.in as the input stream.

