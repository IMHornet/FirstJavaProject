package com.myproject.fields;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.myproject.common.Field;
import com.myproject.common.ProtocolField;

public class IdField implements Field {

	private byte[] data;

	public IdField(byte[] data) {
		this.data = data;
	}

	public ProtocolField getFieldEnum() {
		return ProtocolField.ID;
	}

	public byte[] getValue(InputStream inputStream) {
		byte[] result = new byte[1];
		try {

			result[0] = new DataInputStream(inputStream).readByte();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
