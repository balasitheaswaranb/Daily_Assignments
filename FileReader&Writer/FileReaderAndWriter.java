package com.filereader;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

class Reader {
	BufferedReader bufferReader;

	public int getNumberOfLines() throws IOException {
		bufferReader = new BufferedReader(
				new FileReader("A:\\New folder (2)\\Eclipse\\OOPs\\src\\com\\filereader\\FileReaderAndWriter.java"));
		int numberOfLines = 0;
		while (bufferReader.readLine() != null) {
			numberOfLines++;
		}
		bufferReader.close();
		return numberOfLines;
	}

	public int getNumberOfCharacters() throws IOException {
		bufferReader = new BufferedReader(
				new FileReader("A:\\New folder (2)\\Eclipse\\OOPs\\src\\com\\filereader\\FileReaderAndWriter.java"));

		int numberOfCharacters = 0;
		int i;
		while ((i = bufferReader.read()) != -1) {
			numberOfCharacters++;
		}
		return numberOfCharacters;
	}
}

class Writer extends Reader {

	FileWriter fileWriter;

	Writer() throws IOException {
		bufferReader = new BufferedReader(
				new FileReader("A:\\New folder (2)\\Eclipse\\OOPs\\src\\com\\filereader\\FileReaderAndWriter.java"));
		fileWriter = new FileWriter("A:\\Copy.txt");
	}

	public void writeFile() throws IOException {
		int j;
		while ((j = bufferReader.read()) != -1) {
			fileWriter.write((char) j);
		}

		bufferReader.close();
		fileWriter.close();
	}
}

public class FileReaderAndWriter {
	public static void main(String[] args) {
		FileReaderAndWriter readAndWrite = new FileReaderAndWriter();
		try {
			readAndWrite.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void run() throws IOException {

		Writer readerWriter = new Writer();
		readerWriter.writeFile();

		System.out.println("Number of characters :" + readerWriter.getNumberOfCharacters());
		System.out.println("Number of Lines :" + readerWriter.getNumberOfLines());
		System.out.println("Location of Writed File A:\\Copy.txt");
	}
}
