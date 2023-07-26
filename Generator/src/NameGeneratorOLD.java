import java.util.Random;

public class NameGeneratorOLD {
	Random rd = new Random();

	String generator() {

		int numberOfCharacters = rd.nextInt(6) + 3;
		String name = "x";

		int randomNumberFirst = rd.nextInt(26) + 65;
		char randomCharacterFirst = (char) randomNumberFirst;
		name += Character.toString(randomCharacterFirst);

		for (int i = 1; i < numberOfCharacters; i++) {
			char d = name.charAt(i);
			char d2 = name.charAt(i - 1);

			if (d == 'A' || d == 'E' || d == 'I' || d == 'O' || d == 'U' || d == 'Y' || d == 'a' || d == 'e' || d == 'i'
					|| d == 'o' || d == 'u' || d == 'y') {

				int number = rd.nextInt(2);

				if (number == 0) {
					int randomNumber = rd.nextInt(20);
					char randomCharacter = 0;
					switch (randomNumber) {
					case 0:
						randomCharacter = 'b';
						break;
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
				}
				if (number == 1 && name.length() >= 2 && (d2 != 'A' || d2 != 'E' || d2 != 'I' || d2 != 'O' || d2 != 'U'
						|| d2 != 'Y' || d2 != 'a' || d2 != 'e' || d2 != 'i' || d2 != 'o' || d2 != 'u' || d2 != 'y')) {
					int randomNumber = rd.nextInt(6);
					char randomCharacter = 0;
					switch (randomNumber) {
					case 0:
						randomCharacter = 'a';
						break;
					case 1:
						randomCharacter = 'e';
						break;
					case 2:
						randomCharacter = 'i';
						break;
					case 3:
						randomCharacter = 'o';
						break;
					case 4:
						randomCharacter = 'u';
						break;
					case 5:
						randomCharacter = 'y';
						break;
					}
					name += Character.toString(randomCharacter);
				}
				if (number == 1 && name.length() >= 2 && (d2 == 'A' || d2 == 'E' || d2 == 'I' || d2 == 'O' || d2 == 'U'
						|| d2 == 'Y' || d2 == 'a' || d2 == 'e' || d2 == 'i' || d2 == 'o' || d2 == 'u' || d2 == 'y')) {
					int randomNumber = rd.nextInt(20);
					char randomCharacter = 0;
					switch (randomNumber) {
					case 0:
						randomCharacter = 'b';
						break;
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
				}
			} else {
				int randomNumber = rd.nextInt(6);
				char randomCharacter = 0;
				switch (randomNumber) {
				case 0:
					randomCharacter = 'a';
					break;
				case 1:
					randomCharacter = 'e';
					break;
				case 2:
					randomCharacter = 'i';
					break;
				case 3:
					randomCharacter = 'o';
					break;
				case 4:
					randomCharacter = 'u';
					break;
				case 5:
					randomCharacter = 'y';
					break;

				}
				name += Character.toString(randomCharacter);
			}
		}
		String nameClearX = name.substring(1);
		return nameClearX;
	}
}
