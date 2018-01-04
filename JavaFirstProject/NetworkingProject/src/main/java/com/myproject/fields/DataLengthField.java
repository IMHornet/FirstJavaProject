package com.myproject.fields;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.myproject.common.ProtocolField;

public class DataLengthField {

	private byte[] data;

	public DataLengthField(byte[] data) {
		this.data = data;
	}

	public ProtocolField getFieldEnum() {
		return ProtocolField.LENGTH;
	}

	public byte[] getValue(InputStream inputStream) {
		byte[] result = new byte[2];
		
		try {

			result[0] = new DataInputStream(inputStream).readByte();
			result[1] = new DataInputStream(inputStream).readByte();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
