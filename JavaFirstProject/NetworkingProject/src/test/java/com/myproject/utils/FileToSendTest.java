package com.myproject.utils;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;



public class FileToSendTest {

	public byte[] testArray;
	
	@Test
	public void read_File_Returned_Byte_Array() {
		FileToSend file =  new FileToSend("D:\\JAVA\\n.txt");
		testArray = file.getBufferSend();
		assertArrayEquals(testArray, file.getBufferSend());
	}

}
