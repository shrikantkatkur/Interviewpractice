package SeleniumMidLevelcodes;

public class InvalidBrowserNameError extends Error {
	private String msg;
	public InvalidBrowserNameError(String BrowserName) {
    msg=("Invalid Browser Name 12345:"+BrowserName);
	}
	@Override
	public String toString() {
		return msg;
	}
		
	}


