package primeThreads.util;

import java.io.BufferedReader;
import java.io.IOException;

import primeThreads.util.Logger.DebugLevel;

public class FileProcessor {
	/**
	 * @param filename
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	String a ="0";
	@SuppressWarnings("resource")

	public synchronized String readLineFromFile(BufferedReader z)
			throws IOException {
		String line = z.readLine();

		//System.out.println("LINE is : "+line);
		/*if(line!= null) {
			return line;
		}*/
		return line;
		//return a;
	}
}


