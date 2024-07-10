package stringprograms;

public class CheckMobileNo {
	public static boolean isValidMobileNumberRegX(String number) {
		return number.matches("[0-9]{10}");
		//return number.charAt(0)=("[6-9]{1}"&& number.matches("[0-9]{10}");
	}

	public static void main(String[] args) {
System.out.println(isValidMobileNumberRegX("9028594784"));
	}

}
