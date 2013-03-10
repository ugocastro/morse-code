Feature: Encrypt Word to Morse Code
	In War it as used to encrypt words to morse code
	
Scenario: Encrypt
	Given I have a Morse Code Encrypter
	When I have the word "WAR"
	Then I should received ".-- .- .-. " 