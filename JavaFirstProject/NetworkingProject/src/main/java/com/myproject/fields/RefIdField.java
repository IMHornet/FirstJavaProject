package com.myproject.fields;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.myproject.common.Field;
import com.myproject.common.ProtocolField;

public class RefIdField implements Field {
	
	private byte[] data;

	public RefIdField(byte[] data) {
		this.data = data;
	}

	public ProtocolField getFieldEnum() {
		return ProtocolField.REF_ID;
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
