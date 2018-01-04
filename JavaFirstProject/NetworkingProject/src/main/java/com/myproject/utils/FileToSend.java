package com.myproject.utils;

import java.io.FileInputStream;
import java.io.IOException;

public class FileToSend implements FileUtil {

	private byte[] bufferSend;
	private String fileName;

	public FileToSend() {
		bufferSend = null;
		fileName = null;
	}

	public FileToSend(String str) {

		fileName = str;
		try (FileInputStream fin = new FileInputStream(fileName)) {
			System.out.println("Размер файла: " + fin.available() + " байт(а)\t");
			bufferSend = new byte[fin.available()];
			fin.read(bufferSend, 0, fin.available());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public String getFileName() {
		return fileName;
	}

	public byte[] getBufferSend() {
		return bufferSend;
	}

	@Override
	public byte[] readFile(String str) {
		fileName = str;
		try (FileInputStream fin = new FileInputStream(fileName)) {
			System.out.println("Размер файла: " + fin.available() + " байт(а)\t");
			bufferSend = new byte[fin.available()];
			fin.read(bufferSend, 0, fin.available());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return bufferSend;
	}

	@Override
	public void writeFile(byte[] fSend,String fileName) {
	}

}
