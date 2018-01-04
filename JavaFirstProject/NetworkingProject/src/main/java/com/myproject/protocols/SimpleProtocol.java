package com.myproject.protocols;

import com.myproject.common.Message;

public class SimpleProtocol extends AProtocol {

	 private byte[] data;

	    public SimpleProtocol(byte[] data) {
	        this.data = data;
	    }

	    @Override
	    public Message getMessage() {
		        return null;
	    }
	
	
	

}
