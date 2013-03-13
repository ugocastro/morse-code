Feature: Decrypt Morse Code into Word
	In War it as used to decrypt morse code to words
	
Scenario: Decrypt
	Given I have a Morse Code Decrypter
	When I have the morse code ".-- .- .-. "
	Then I should receive "WAR" 