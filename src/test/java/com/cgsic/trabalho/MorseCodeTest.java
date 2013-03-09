package com.cgsic.trabalho;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class MorseCodeTest {
	
	MorseCode morseCode;
	
	@Before
	public void setUp(){
		morseCode = new MorseCode();
	}
	
	@Test
	public void shouldEncryptASimpleStringToMorseCode(){
		String result = morseCode.getMorseCharacter('A');
		
		Assert.assertEquals(result, ".- ");
	}
	
	@Test
	public void shouldEncryptASimpleNumberToMorseCode(){
		String result = morseCode.getMorseCharacter('1');
		
		Assert.assertEquals(result, ".---- ");
	}
	
	@Test
	public void shouldEncryptAWordToMorseCode(){
		String result = morseCode.encrypt("WAR");
		
		Assert.assertEquals(result, ".-- .- .-. ");
	}
	
	@Test
	public void shouldEncryptyAPhraseToMorseCode(){
		String result = morseCode.encrypt("CODIGO MORSE");
		
		Assert.assertEquals(result, "-.-. --- -.. .. --. ---    -- --- .-. ... . ");
	}
}
