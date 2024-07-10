package com.OOPS;

public class InvalidBrowserException extends Error {
	private String msg;

	public InvalidBrowserException(String browsername) {
		msg = "InvalidBrowserException  " + browsername;
	}

	@Override
	public String toString() {
		return msg;
	}

}
