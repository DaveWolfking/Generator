import java.util.Random;

public class NameGenerator {
	Random rd = new Random();

	String generator() {

		int numberOfCharacters = rd.nextInt(5) + 3;
		String name = "";

		int randomNumberFirst = rd.nextInt(26) + 65;
		char randomCharacterFirst = (char) randomNumberFirst;
		name += Character.toString(randomCharacterFirst);

		for (int i = 0; i < numberOfCharacters; i++) {
			char d = name.charAt(i);
			if (d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U' || d == 'Y' || d == 'a' || d == 'e' || d == 'i'
					|| d == 'o' || d == 'u' || d == 'y') {

				int randomNumber = rd.nextInt(20);
				int randomNumber2 = rd.nextInt(100) + 1;
				char randomCharacter = 0;
				char randomCharacter2 = 0;
				switch (randomNumber) {
				case 0:
					if (randomNumber2 <= 10) {
						randomCharacter = 'b';
						randomCharacter2 = 'r';
					} else {
						randomCharacter = 'b';
					}
				case 1:
					randomCharacter = 'c';
					break;
				case 2:
					randomCharacter = 'd';
					break;
				case 3:
					randomCharacter = 'f';
					break;
				case 4:
					randomCharacter = 'g';
					break;
				case 5:
					randomCharacter = 'h';
					break;
				case 6:
					randomCharacter = 'j';
					break;
				case 7:
					randomCharacter = 'k';
					break;
				case 8:
					randomCharacter = 'l';
					break;
				case 9:
					randomCharacter = 'm';
					break;
				case 10:
					randomCharacter = 'n';
					break;
				case 11:
					randomCharacter = 'p';
					break;
				case 12:
					randomCharacter = 'q';
					break;
				case 13:
					randomCharacter = 'r';
					break;
				case 14:
					randomCharacter = 's';
					break;
				case 15:
					randomCharacter = 't';
					break;
				case 16:
					randomCharacter = 'v';
					break;
				case 17:
					randomCharacter = 'w';
					break;
				case 18:
					randomCharacter = 'x';
					break;
				case 19:
					randomCharacter = 'z';
					break;

				}
				name += Character.toString(randomCharacter);
				if (randomCharacter2 > 0) {
					name += Character.toString(randomCharacter2);
					i++;
				}
			} else {
				int randomNumber = rd.nextInt(6);
				int randomNumber2 = rd.nextInt(100) + 1;
				char randomCharacter = 0;
				char randomCharacter2 = 0;
				switch (randomNumber) {
				case 0:
					if (randomNumber2 <= 10) {
						randomCharacter = 'a';
						randomCharacter2 = 'u';
					} else {
						randomCharacter = 'a';
					}
					break;
				case 1:
					if (randomNumber2 <= 5) {
						randomCharacter = 'e';
						randomCharacter2 = 'i';
					}
					if (randomNumber2 > 5 && randomNumber2 <= 10) {
						randomCharacter = 'e';
						randomCharacter2 = 'o';
					}
					if (randomNumber2 > 10 && randomNumber2 <= 15) {
						randomCharacter = 'e';
						randomCharacter2 = 'u';
					} else {
						randomCharacter = 'e';
					}
					break;
				case 2:
					if (randomNumber2 <= 5) {
						randomCharacter = 'i';
						randomCharacter2 = 'e';
					}
					if (randomNumber2 > 5 && randomNumber2 <= 10) {
						randomCharacter = 'i';
						randomCharacter2 = 'u';
					} else {
						randomCharacter = 'i';
					}
					break;
				case 3:
					if (randomNumber2 <= 10) {
						randomCharacter = 'o';
						randomCharacter2 = 'u';
					} else {
						randomCharacter = 'o';
					}
					break;
				case 4:
					if (randomNumber2 <= 10) {
						randomCharacter = 'u';
						randomCharacter2 = 'o';
					} else {
						randomCharacter = 'u';
					}
					break;
				case 5:
					randomCharacter = 'y';
					break;

				}
				name += Character.toString(randomCharacter);
				if (randomCharacter2 > 0) {
					name += Character.toString(randomCharacter2);
					i++;
				}
			}
		}

		return name;
	}
}
