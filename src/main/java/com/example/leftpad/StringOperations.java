package com.example.leftpad;

public class StringOperations {

	public String leftPad(String input, int length, char c) {
   		int paddingLength = length - input.length();
   		int i = 0;
   		while (i < paddingLength) {
   			input = c + input;
   			i++;
		}
		return input;
	}

}
