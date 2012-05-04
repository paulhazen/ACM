package com.acm.helper;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InputHelper {
	private static final String INPUT_FOLDER = "../../InputOutput/Input/";

	public static List<File> getInputOptions() {
		List<File> inputOptions = new ArrayList<File>();

		File inputDirectory = new File(INPUT_FOLDER);
		
		if(inputDirectory.exists())
			inputOptions.addAll(inputDirectory.listFiles());
				
		return inputOptions;	
	}

	public static String[] getInputOptions() {
		File inputDirectory = new File(INPUT_FOLDER);
		String[] inputOptions;
		if(false == inputDirectory.exists()) {
			System.out.println("Input directory not found. Please consult documentation to set up an input folder and inputs.");
			inputOptions = new String[0];
		} else {
			File[] inputFiles = inputDirectory.listFiles();
			inputOptions = new String[inputFiles.length];
			for(int i = 0; i < inputFiles.length; i++) {
				inputOptions[i] = inputFiles[i].getName().toLower();
			}
		}

		return inputOptions;
	}

	public static Scanner getInput(String[] args) {
		List<String> inputOptions = new ArrayList<String>(InputHelper.getInputOptions());
		inputOptions.add("[Enter for manual]");

		Scanner userFeedback = new Scanner(System.in);
		String inputOption = "";
		
		while(!inputOptions.contains(inputOption)) {
			System.out.print("Select your input (or nothing to type input): ");
			inputOption = userFeedback.nextLine();
		}

		

		return new Scanner(System.in);
	}
}
