package com.target.assignment.vo;

/**
 * @author sonali.vaid
 *
 */
public class Players {
	
	String name;
	Card[] cards = new Card[5];

	public Players(String name) {
	this.name = name;
	}

	public String getName() {
	return name;
	}

	public void receiveCard(Card card, int position) {
	cards[position] = card;
	}

	public void showPlayerCards() {
	for (Card card : cards) {
	System.out.printf(card.getSuite().getSuitCode() + " " +  card.getFaceValue().getCode() + "  " + "\n");
	}
	System.out.println("\n");
	}

}
