package globantinterview;

public class InvalidBrowserNameError extends Error {
	private String msg;
	public InvalidBrowserNameError(String BrowserName) {
    msg=("Invalid Browser Name:"+BrowserName);
	}
	@Override
	public String toString() {
		return msg;
	}
		
	}


