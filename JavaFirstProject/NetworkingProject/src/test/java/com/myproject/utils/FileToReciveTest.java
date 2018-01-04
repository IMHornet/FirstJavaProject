package com.myproject.utils;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class FileToReciveTest {

	byte[] buff;


	@Test
	public void write_File_Accept_Byte_Array() {

		FileToRecive file = new FileToRecive();
		buff = file.getSendFile().readFile("D:\\JAVA\\hornet.jpg");
		assertEquals(buff,file.getSendFile().getBufferSend());
		file.writeFile(buff, "D:\\JAVA\\hornet6.jpg");

	}

}
