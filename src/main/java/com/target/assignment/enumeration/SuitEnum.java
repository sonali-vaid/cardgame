package com.target.assignment.enumeration;

/**
 * @author sonali.vaid
 *
 */
public enum SuitEnum {

	DIAMONDS("D", 1),
	HEARTS("H", 2),
	CLUBS("C", 3),
	SPADES("S", 4);
	
	private int suitPriority;
	private String suitCode;
	
	 private SuitEnum(String suitCode, int suitPriority) {
		this.suitCode = suitCode;
        this.suitPriority = suitPriority;
    }

	public int getSuitPriority() {
		return suitPriority;
	}

	public String getSuitCode(){
		return suitCode;
	}
}
