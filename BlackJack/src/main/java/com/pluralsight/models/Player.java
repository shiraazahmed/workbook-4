package com.pluralsight.models;

public class Player {
    private final String name;
    private final Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getHandValue() {
        return hand.getValue();
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand + " (Value: " + getHandValue() + ")";
    }
}


