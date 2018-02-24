public class SimpleCalculations {
	public String odd(String x) {
		String tempResult = "";
		for (int i = 0; i < x.length(); i++) {
			int numberOfLetter = Integer.parseInt(Character.toString(x.charAt(i)));
			if (numberOfLetter % 2 == 1) {
				tempResult += Character.toString(x.charAt(i));
			}
		}
		int ans =Integer.parseInt(tempResult.trim())*Integer.parseInt(tempResult.trim())*Integer.parseInt(tempResult.trim());
		return String.valueOf(ans);
	}
	public String even(String x) {
		String tempResult = "";
		for (int i = 0; i < x.length(); i++) {
			int numberOfLetter = Integer.parseInt(Character.toString(x.charAt(i)));
			if (numberOfLetter % 2 == 0) {
				tempResult += Character.toString(x.charAt(i));
			}
		}
		int ans =Integer.parseInt(tempResult.trim())*Integer.parseInt(tempResult.trim());
		return String.valueOf(ans);
	}
	public int mult(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		return a /b;
	}
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
	return a - b;
	}

/*	public long odd(String x) {
		String tempResult = "";
		for (int i = 0; i < x.length(); i++) {
			int numberOfLetter = Integer.parseInt(Character.toString(x.charAt(i)));
		if (numberOfLetter % 2 == 1) {
				tempResult += Character.toString(x.charAt(i));
			}
		}
		return Integer.parseInt(tempResult.trim());
	}*/

}