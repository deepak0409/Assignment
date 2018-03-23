package com.bonzai.assigment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TailFContinuousReading {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader reader = new BufferedReader (new FileReader("Reading.txt"));
		String line;
		while (true) {
		    line = reader.readLine();
		    if (line != null)
		        System.out.println(line);
		    else 
		        Thread.sleep(1);
		}

	}

}
