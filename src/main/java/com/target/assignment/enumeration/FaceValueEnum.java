package com.target.assignment.enumeration;

/**
 * @author sonali.vaid
 *
 */
public enum FaceValueEnum {

	ACE("Ace", 1),
	TWO("2", 2),
	THREE("3", 3),
	FOUR("4", 4),
	FIVE("5", 5),
	SIX("6", 6),
	SEVEN("7", 7),
	EIGHT("8", 8),
	NINE("9", 9),
	TEN("10", 10),
	JACK("Jack", 11),
	QUEEN("Queen", 12),
	KING("King", 13);
	
	private int value;
	private String code;
	
	 private FaceValueEnum(String code, int value) {
		 this.code = code;
        this.value = value;
    }

	public int getValue() {
		return value;
	}
	
	public String getCode() {
		return code;
	}
}
