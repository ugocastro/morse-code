package com.cgsic.trabalho.functional;

import static org.junit.Assert.assertTrue;

import com.cgsic.trabalho.MorseCode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DecryptMorseCodeStepdefs {

	private MorseCode morseCodeDecrypter;
	private String morseCode;

	@Given("^I have a Morse Code Decrypter$")
	public void I_have_a_Morse_Code_Decrypter() throws Throwable {
		morseCodeDecrypter = new MorseCode();
	}

	@When("^I have the morse code \"([^\"]*)\"$")
	public void I_have_the_morse_code(String morseCode) throws Throwable {
		this.morseCode = morseCode;
	}

	@Then("^I should receive \"([^\"]*)\"$")
	public void I_should_received(String decrypted) throws Throwable {
		String result = morseCodeDecrypter.decrypt(morseCode);
		assertTrue(result.equals(decrypted));
	}
}
