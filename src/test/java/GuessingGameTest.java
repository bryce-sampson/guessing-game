import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessingGameTest {
	GuessingGame underTest = new GuessingGame();

	@Test
	public void shouldSayWinnerForValueSeven() {
		String response = underTest.playGame(7);
		assertEquals("Winner", response);
	}

	public void shouldSayGuessAgainForValue1() {
		String response = underTest.playGame(1);
		assertEquals("GuessAgain", response);
	}

	@Test
	public void shouldSayGuess1thru10ForValue0() {
		String response = underTest.playGame(0);
		assertEquals("Guess1thru10", response);
	}


	@Test
	public void shouldSayHigherForValueBelow7() {
		String response = underTest.playGame(2);
		assertEquals("Higher", response);
	}

	@Test
	public void shouldSayLowerForValueAbove7() {
		String response = underTest.playGame(9);
		assertEquals("Lower", response);
	}
}
