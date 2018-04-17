package com.example.leftpad;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringOperationsTests {

	private StringOperations stringOperations = new StringOperations();

	@Test
	public void leftPadShouldAddPadding() {
		String input = "hello";
		String output = this.stringOperations.leftPad(input, 7, '*');
		assertThat(output).isEqualTo("**hello");
	}
}