import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	String generator() {

		int numberOfCharacters = 8;
		String password = "";

		for (int i = 0; i < numberOfCharacters; i++) {
			int randomNumber = rd.nextInt(61);

			switch (randomNumber) {
			case 0:
				randomNumber = '0';
				break;
			case 1:
				randomNumber = '1';
				break;
			case 2:
				randomNumber = '2';
				break;
			case 3:
				randomNumber = '3';
				break;
			case 4:
				randomNumber = '4';
				break;
			case 5:
				randomNumber = '5';
				break;
			case 6:
				randomNumber = '6';
				break;
			case 7:
				randomNumber = '7';
				break;
			case 8:
				randomNumber = '8';
				break;
			case 9:
				randomNumber = '9';
				break;
			case 10:
				randomNumber = 'a';
				break;
			case 11:
				randomNumber = 'b';
				break;
			case 12:
				randomNumber = 'c';
				break;
			case 13:
				randomNumber = 'd';
				break;
			case 14:
				randomNumber = 'e';
				break;
			case 15:
				randomNumber = 'f';
				break;
			case 16:
				randomNumber = 'g';
				break;
			case 17:
				randomNumber = 'h';
				break;
			case 18:
				randomNumber = 'i';
				break;
			case 19:
				randomNumber = 'j';
				break;
			case 20:
				randomNumber = 'k';
				break;
			case 21:
				randomNumber = 'l';
				break;
			case 22:
				randomNumber = 'm';
				break;
			case 23:
				randomNumber = 'n';
				break;
			case 24:
				randomNumber = 'o';
				break;
			case 25:
				randomNumber = 'p';
				break;
			case 26:
				randomNumber = 'q';
				break;
			case 27:
				randomNumber = 'r';
				break;
			case 28:
				randomNumber = 's';
				break;
			case 29:
				randomNumber = 't';
				break;
			case 30:
				randomNumber = 'u';
				break;
			case 31:
				randomNumber = 'v';
				break;
			case 32:
				randomNumber = 'w';
				break;
			case 33:
				randomNumber = 'x';
				break;
			case 34:
				randomNumber = 'y';
				break;
			case 35:
				randomNumber = 'z';
				break;
			case 36:
				randomNumber = 'A';
				break;
			case 37:
				randomNumber = 'B';
				break;
			case 38:
				randomNumber = 'C';
				break;
			case 39:
				randomNumber = 'D';
				break;
			case 40:
				randomNumber = 'E';
				break;
			case 41:
				randomNumber = 'F';
				break;
			case 42:
				randomNumber = 'G';
				break;
			case 43:
				randomNumber = 'H';
				break;
			case 44:
				randomNumber = 'I';
				break;
			case 45:
				randomNumber = 'J';
				break;
			case 46:
				randomNumber = 'K';
				break;
			case 47:
				randomNumber = 'L';
				break;
			case 48:
				randomNumber = 'M';
				break;
			case 49:
				randomNumber = 'N';
				break;
			case 50:
				randomNumber = 'O';
				break;
			case 51:
				randomNumber = 'P';
				break;
			case 52:
				randomNumber = 'Q';
				break;
			case 53:
				randomNumber = 'R';
				break;
			case 54:
				randomNumber = 'S';
				break;
			case 55:
				randomNumber = 'T';
				break;
			case 56:
				randomNumber = 'U';
				break;
			case 57:
				randomNumber = 'V';
				break;
			case 58:
				randomNumber = 'W';
				break;
			case 59:
				randomNumber = 'X';
				break;
			case 60:
				randomNumber = 'Y';
				break;
			case 61:
				randomNumber = 'Z';
				break;
			default:
				break;
			}

			char randomCharacter = (char) randomNumber;
			password += Character.toString(randomCharacter);
		}
		return password;

	}
}