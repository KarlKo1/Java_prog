package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex15 {
    public static void main(String[] args) {
        // write some test code here
        Hand hand = new Hand();

        hand.add(new Card(2, Card.SPADES));
        hand.add(new Card(14, Card.CLUBS));
        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));

        hand.sort();

        hand.print();

    }

    public static class Card implements Comparable<Card> {

        /*
         * These are static constant variables. These variables can be used inside and outside
         * of this class like, for example, Card.CLUBS
         */
        public static final int SPADES = 0;
        public static final int DIAMONDS = 1;
        public static final int HEARTS = 2;
        public static final int CLUBS = 3;
        /*
         * To make printing easier, Card-class also has string arrays for suits and values.
         * SUITS[suit] is a string representation of the suit (Clubs, Diamonds, Hearts, Spades)
         * VALUES[value] is an abbreviation of the card's value (A, J, Q, K, [2..10]).
         */
        public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
        public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        private int value;
        private int suit;

        public Card(int value, int suit) {
            this.value = value;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return VALUES[value] + " of " + SUITS[suit];
        }

        public int getValue() {
            return value;
        }

        public int getSuit() {
            return suit;
        }

        @Override
        public int compareTo(Card t) {
            int r = this.getValue() - t.getValue();
            if (r == 0) {
                return this.suit - t.suit;
            }
            return r;
        }

    }

    public static class Hand implements Comparable<Hand> {

        private ArrayList<Card> hand;

        public Hand() {
            hand = new ArrayList<Card>();
        }

        public void add(Card card) {
            hand.add(card);
        }

        public void print() {
            for (Card c : hand) {
                System.out.println(c.toString());
            }
        }

        public int totalValue() {
            int r = 0;
            for (Card c : hand) {
                r = r + c.getValue();
            }
            return r;

        }

        @Override
        public int compareTo(Hand t) {
            return this.totalValue() - t.totalValue();
        }

        public void sort() {
            Collections.sort(hand);
        }

        public void sortAgainstSuit() {
            Collections.sort(hand, new SortAgainstSuitAndValue());
        }
    }

    public class SortAgainstSuit implements Comparator<Card> {
        public int compare(Card card1, Card card2) {
            return card1.getSuit() - card2.getSuit();
        }
    }

    public static class SortAgainstSuitAndValue implements Comparator<Card> {

        public int compare(Card card1, Card card2) {
            if (card1.getSuit() - card2.getSuit() == 0) {
                return card1.getValue() - card2.getValue();
            } else {
                return card1.getSuit() - card2.getSuit();
            }
        }
    }
}