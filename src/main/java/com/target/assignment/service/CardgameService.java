package com.target.assignment.service;


import java.util.Stack;

import com.target.assignment.vo.Card;
import com.target.assignment.vo.Deck;
import com.target.assignment.vo.Players;

/**
 * @author sonali.vaid
 *
 */
public class CardgameService {

	private static final int noOfPlayers = 4;
	
	public static void main(String[] args) {

		Deck deck = new Deck();
		Players[] players = new Players[noOfPlayers]; // 4 players as per case study

		Stack<Card> cards = deck.getDeck();

		System.out.println("Unshuffled Deck of Cards....");
		deck.showCards(cards);

		Stack<Card> shuffledDeck = deck.getShuffledDeck(); // case study story - 1)
		System.out.println("Shuffled Deck of Cards....");
		deck.showCards(cards);

		for (int i = 0; i < players.length; i++) {
			players[i] = new Players("Player " + (i + 1)); // setting Player name example - Player 1
		}

		Players[] playerCards = deck.dealCards(players, shuffledDeck); // case study story - 2

		for (Players player : playerCards) {
			System.out.println(player.getName());
			player.showPlayerCards();
		}
		
		
	}

}
