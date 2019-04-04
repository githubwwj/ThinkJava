package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {

	private BufferedReader bufferedReader;

	public InputFile(String fileName) throws FileNotFoundException {
		bufferedReader = new BufferedReader(new FileReader(fileName));
	}

	public String getLine() throws IOException {
		String readLine = bufferedReader.readLine();
		return readLine;
	}

	public void close() {
		try {
			if (null != bufferedReader)
				bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			InputFile inputFile = new InputFile("E:\\ThinkInJava\\ThinkJava\\src\\exceptions\\PigSty.java");
			String line = null;
			try {
				while ((line = inputFile.getLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
