package com.target.assignment.vo;

import com.target.assignment.enumeration.FaceValueEnum;
import com.target.assignment.enumeration.SuitEnum;

/**
 * @author sonali.vaid
 *
 */
public class Card {

	private SuitEnum suit;
	private FaceValueEnum faceValue;

	public Card(SuitEnum suit, FaceValueEnum faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}

	public SuitEnum getSuite() {
		return suit;
	}

	public FaceValueEnum getFaceValue() {
		return faceValue;
	}

}
