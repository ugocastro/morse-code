package com.cgsic.trabalho;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class MorseCodeTest {

	MorseCode morseCode;

	@Before
	public void setUp() {
		morseCode = new MorseCode();
	}

	@Test
	public void shouldEncryptASimpleStringToMorseCode() {
		String result = morseCode.morseCodeTranslations.get("A");

		Assert.assertEquals(result, ".- ");
	}

	@Test
	public void shouldEncryptASimpleNumberToMorseCode() {
		String result = morseCode.morseCodeTranslations.get("1");

		Assert.assertEquals(result, ".---- ");
	}

	@Test
	public void shouldEncryptAWordToMorseCode() {
		String result = morseCode.encrypt("WAR");

		Assert.assertEquals(result, ".-- .- .-. ");
	}

	@Test
	public void shouldEncryptyAPhraseToMorseCode() {
		String result = morseCode.encrypt("CODIGO MORSE");

		Assert.assertEquals(result,
				"-.-. --- -.. .. --. ---  -- --- .-. ... . ");
	}

	@Test
	public void shouldDecryptASimpleMorseCodeString() {
		String result = morseCode.decrypt("-... ");

		Assert.assertEquals("B", result);
	}

	@Test
	public void shouldDecryptASimpleMorseCodeNumber() {
		String result = morseCode.decrypt("...-- ");

		Assert.assertEquals("3", result);
	}

	@Test
	public void shouldDecryptASimpleMorseCodeWord() {
		String result = morseCode.decrypt(".-- .- .-. ");

		Assert.assertEquals("WAR", result);
	}

	@Test
	public void shouldDecryptASimpleMorseCodePhrase() {
		String result = morseCode
				.decrypt("-.-. --- -.. .. --. ---  -- --- .-. ... . ");

		Assert.assertEquals("CODIGO MORSE", result);
	}
}
