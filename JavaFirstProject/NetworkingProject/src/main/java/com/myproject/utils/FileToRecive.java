package com.myproject.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToRecive implements FileUtil {

	private byte[] reciveBuffer;
	private String fileName;
	private FileToSend sendFile;

	public FileToRecive() {
		reciveBuffer = null;
		fileName = null;
		sendFile = new FileToSend();
	}

	public FileToRecive(FileToSend sendFile, String fileName) {

		this.fileName = fileName;
		try (FileOutputStream fos = new FileOutputStream(fileName)) {
			reciveBuffer = sendFile.getBufferSend();
			fos.write(reciveBuffer, 0, reciveBuffer.length);
			System.out.println("Размер файла: " + reciveBuffer.length + " байт(а)\t");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getReciveBuffer() {
		return reciveBuffer;
	}

	public FileToSend getSendFile() {
		return sendFile;
	}

	@Override
	public void writeFile(byte[] fSend, String fileName) {

		File nFile = new File(fileName);
		if (nFile.exists()) {
			System.out.println("File Exist!!!");
		} else {
			try (FileOutputStream fos = new FileOutputStream(fileName)) {
				reciveBuffer = fSend;
				fos.write(reciveBuffer, 0, reciveBuffer.length);
				System.out.println("Размер файла: " + reciveBuffer.length + " байт(а)\t");

			} catch (IOException ex) {
				System.out.println(ex.getMessage());

			}
		}
	}

	@Override
	public byte[] readFile(String str) {
		return null;

	}

}
