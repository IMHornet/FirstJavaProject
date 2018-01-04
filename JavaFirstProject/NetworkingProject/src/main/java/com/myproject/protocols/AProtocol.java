package com.myproject.protocols;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.myproject.common.Message;
import com.myproject.common.ProtocolField;
import com.myproject.fields.IdField;

public abstract class AProtocol {

	private List<ProtocolField> protocolFields = new ArrayList();

	public abstract Message getMessage();

	public List<ProtocolField> getProtocolFields() {
		return Collections.unmodifiableList(protocolFields);
	}

	public static AProtocol getInstance(byte[] data) {
		DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));
		if (data.length < 1) {
			throw new InvalidParameterException("Not enough data for Protocol detection");
		}
		byte[] protocolId = new IdField(data).getValue(is);

		AProtocol abstractProtocol;
		switch (protocolId[0]) {
		case 0:
			return new SimpleProtocol(data);
		default:
			break;
		}

		throw new RuntimeException("Unknown Protocol ID");
	}
}
