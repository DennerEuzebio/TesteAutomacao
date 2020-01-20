package framework;

import java.util.Random;

public class Utils {

	public String geraStringlAleatoria() {
		int leftLimit = 97; // letra 'a'
		int rightLimit = 122; // letra 'z'
		int targetStringLength = 8;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();

		return generatedString;
	}
}
