package services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ConsoleServiceTest {
	static String[] sameId = new String[]{"1"};
	static String[] zeroId = new String[]{"0"};
	static String[] negativeId = new String[]{"-1"};
	static String[] charId = new String[]{"text!"};
	static String[] spaceId = new String[]{" "};
	static String[] multiId = new String[]{"a", "b", "c"};

	@Test
	public void returnsTheSameIdAsPassed() {
		int result = 1;
		Assertions.assertEquals(result, ConsoleService.getUserId(sameId));
	}

	@Test
	public void idIsZero() {
		int result = 0;
		Assertions.assertEquals(result, ConsoleService.getUserId(zeroId));
	}

	@Test
	public void idIsNegative() {
		int result = 0;
		Assertions.assertEquals(result, ConsoleService.getUserId(negativeId));
	}

	@Test
	public void charArguments() {
		Throwable thrown = assertThrows(NumberFormatException.class, () ->
			ConsoleService.getUserId(charId)
		);
		assertNotNull(thrown);
	}

	@Test
	public void spaceArguments() {
		Throwable thrown = assertThrows(NumberFormatException.class, () ->
				ConsoleService.getUserId(spaceId)
		);
		assertNotNull(thrown);
	}

	@Test
	public void moreThanOneArgument() {
		Throwable thrown = assertThrows(IllegalArgumentException.class, () ->
			ConsoleService.getUserId(multiId)
		);
		assertNotNull(thrown);
	}
}