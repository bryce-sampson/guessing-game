import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessingGame {

	public String playGame(int yourNumber) {

		if (yourNumber == 7) {
			return "Winner";
		}
		else if (yourNumber > 0 && yourNumber < 7) {
			return "Higher";
		}
		else if (yourNumber > 7 && yourNumber <= 10) {
			return "Lower";
		}
		else if (yourNumber == 0) {
			return "Guess1thru10";
		}
		else if (yourNumber != 7) {
			return "GuessAgain";
		}

		return "Invalid";
	}
}
