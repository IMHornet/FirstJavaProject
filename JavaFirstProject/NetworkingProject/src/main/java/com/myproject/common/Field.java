package com.myproject.common;

import java.io.InputStream;

public interface Field {

	ProtocolField getFieldEnum();

	byte[] getValue(InputStream inputStream);

}
