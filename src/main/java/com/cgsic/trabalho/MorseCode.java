package com.cgsic.trabalho;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class MorseCode {

	public BiMap<String, String> morseCodeTranslations;

	public MorseCode() {
		morseCodeTranslations = HashBiMap.create();
		morseCodeTranslations.put("A", ".- ");
		morseCodeTranslations.put("B", "-... ");
		morseCodeTranslations.put("C", "-.-. ");
		morseCodeTranslations.put("D", "-.. ");
		morseCodeTranslations.put("E", ". ");
		morseCodeTranslations.put("F", "..-. ");
		morseCodeTranslations.put("G", "--. ");
		morseCodeTranslations.put("H", ".... ");
		morseCodeTranslations.put("I", ".. ");
		morseCodeTranslations.put("J", ".--- ");
		morseCodeTranslations.put("K", "-.- ");
		morseCodeTranslations.put("L", ".-.. ");
		morseCodeTranslations.put("M", "-- ");
		morseCodeTranslations.put("N", "-. ");
		morseCodeTranslations.put("O", "--- ");
		morseCodeTranslations.put("P", ".--. ");
		morseCodeTranslations.put("Q", "--.- ");
		morseCodeTranslations.put("R", ".-. ");
		morseCodeTranslations.put("S", "... ");
		morseCodeTranslations.put("T", "- ");
		morseCodeTranslations.put("U", "..- ");
		morseCodeTranslations.put("V", "...- ");
		morseCodeTranslations.put("W", ".-- ");
		morseCodeTranslations.put("X", "-..- ");
		morseCodeTranslations.put("Y", "-.-- ");
		morseCodeTranslations.put("Z", "--.. ");
		morseCodeTranslations.put("0", "----- ");
		morseCodeTranslations.put("1", ".---- ");
		morseCodeTranslations.put("2", "..--- ");
		morseCodeTranslations.put("3", "...-- ");
		morseCodeTranslations.put("4", "....- ");
		morseCodeTranslations.put("5", "..... ");
		morseCodeTranslations.put("6", "-.... ");
		morseCodeTranslations.put("7", "--... ");
		morseCodeTranslations.put("8", "---.. ");
		morseCodeTranslations.put("9", "----. ");
		morseCodeTranslations.put(" ", " ");
	}

	public String encrypt(String string) {
		String result = "";

		for (int i = 0; i < string.length(); i++) {
			Character character = Character.toUpperCase(string.charAt(i));
			result += morseCodeTranslations.get(character.toString());
		}

		return result;
	}

	public String decrypt(String morseCode) {
		String[] characters = morseCode.split(" ");
		String result = "";

		for (int i = 0; i < characters.length; i++) {
			result += morseCodeTranslations.inverse().get(characters[i] + " ");
		}

		return result;
	}
}
