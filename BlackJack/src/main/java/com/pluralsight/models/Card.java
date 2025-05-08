package com.pluralsight.models;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = true;
    }

    public int getPointValue() {
        if (value.equals("Ace")) {
            return 11;
        } else if (value.equals("King") || value.equals("Queen") || value.equals("Jack")) {
            return 10;
        } else {
            return Integer.parseInt(value);
        }
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}




