package com.debi.java.builder.utility;

public class Utility {

	
	public static void isTrue(boolean expression, String errorMessageTemplate, Object... errorMessageArguments) {
        isTrue(expression, String.format(errorMessageTemplate, errorMessageArguments));
    }
	
	public static void isTrue(boolean expression, String errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
