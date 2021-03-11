package com.target.assignment.vo;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

import com.target.assignment.enumeration.FaceValueEnum;
import com.target.assignment.enumeration.SuitEnum;

/**
 * @author sonali.vaid
 *
 */
public class Deck {
	
	private static final int size = SuitEnum.values().length * FaceValueEnum.values().length;
	private static final int noOfCardsPerPlayer = 5;
	private static final int noOfPlayers = 4;
	
	private Stack<Card> deckOfCards = new Stack<Card>();
	
	public Deck() {
		// Initialise card deck containing 52 cards 
		int count = 0;
		for (SuitEnum s : SuitEnum.values()) {
			for (FaceValueEnum f : FaceValueEnum.values()) {
				Card card = new Card(s, f);
				deckOfCards.push(card);
			}
		}
	}
	
	/**
	 * @return shuffled deck of cards from initialised deck
	 */
	public Stack<Card> getShuffledDeck() {
		 Collections.shuffle(deckOfCards);
		 return deckOfCards;
	}
	
	
	/** show all the cards available in deck
	 * @param cards
	 */
	public void showCards(Stack<Card> cards) {
		for(Card card : cards) {
			System.out.println(card.getSuite().getSuitCode() + "  " + card.getFaceValue().getCode() + "\n");
		}
	}
	
	/** Distribute cards to players and each card should be unique
	 * @param players
	 * @param deck
	 * @return
	 */
	public Players[] dealCards(Players[] players, Stack<Card> deck) {
		for(int i = 0; i < noOfPlayers; i++) {
			for (int j = 0; j < noOfCardsPerPlayer; j++) {
				players[i].receiveCard(deck.get(i + j * 4), j);
			}
		}
		return players;
	}
	
	/**
	 * @return deck of cards
	 */
	public Stack<Card> getDeck() {
		return deckOfCards;
	}
	
	/**
	 * @param deck
	 * @return popped element from deck
	 */
	public Card drawCard(Stack<Card> deck) {
        return deck.pop();
    }

}
