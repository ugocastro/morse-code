package com.cgsic.trabalho.functional;

import static org.junit.Assert.assertTrue;

import com.cgsic.trabalho.MorseCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EncryptToMorseCodeStepdefs {

	private MorseCode morseCode;
	private String word;

	@Given("^I have a Morse Code Encrypter$")
	public void I_have_a_Morse_Code_Encrypter() throws Throwable {
		morseCode = new MorseCode();
	}

	@When("^I have the word \"([^\"]*)\"$")
	public void I_have_the_word(String word) throws Throwable {
		this.word = word;
	}

	@Then("^I should received \"([^\"]*)\"$")
	public void I_should_received(String encrypted) throws Throwable {
		String result = morseCode.encrypt(word);
		assertTrue(result.equals(encrypted));
	}
}
