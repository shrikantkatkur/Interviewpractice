package stringprograms;

public class CheckPANNo {

	public static boolean isValidPanRegX(String number) {
		return number.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	public static void main(String[] args) {
		System.out.println(isValidPanRegX("BDOPK8656C"));
//System.out.println(isValidPanRegX("BDoPK8656C"));
	}

}
