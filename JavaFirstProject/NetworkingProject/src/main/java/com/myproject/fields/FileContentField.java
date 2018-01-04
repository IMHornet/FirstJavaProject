package com.myproject.fields;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.myproject.common.Field;
import com.myproject.common.ProtocolField;

public class FileContentField implements Field {

	private byte[] data;

	public FileContentField(byte[] data) {
		this.data = data;
	}

	public ProtocolField getFieldEnum() {
		return ProtocolField.CONTENT;
	}

	public byte[] getValue(InputStream inputStream) {
		byte[] result = new byte[64*1024];
		
		try {

			result[0] = new DataInputStream(inputStream).readByte();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
