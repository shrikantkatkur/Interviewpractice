package Interview;

public class InvalidBroError extends Error {
	private String msg;

	public InvalidBroError(String browserName) {
		msg = " InvalidBrowserError shrikantTest  " + browserName;
	}

	@Override
	public String toString() {
		return msg;
	}

}
