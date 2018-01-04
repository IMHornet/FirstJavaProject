package com.myproject.common;

import java.util.LinkedHashMap;
import java.util.Map;

public class Message {
	
	private Map<ProtocolField, byte[]> fields;

	public byte[] getField(ProtocolField protocolField) {
		return fields.get(protocolField);
	}

	public byte[] toBytes() {

		return null;
	}

	public static class MessageBuilder {
		private Map<ProtocolField, byte[]> fields = new LinkedHashMap<ProtocolField, byte[]>();

		public void addField(ProtocolField fieldEnum, byte[] data) {
			fields.put(fieldEnum, data);
		}

		public Message build() {
			Message message = new Message();
			message.fields = fields;
			return message;
		}
	}

}
