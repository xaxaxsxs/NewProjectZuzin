package org.example;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Card> cards = new ArrayList<>();


    public ArrayList<Card> getCards() {
        createCards();
        return cards;
    }
    private void createCards(){
        Card card1 = new Card(123123123);
        Card card2 = new Card(223123123);
        Card card3 = new Card(323123123);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
    }
    private void addPinCode(){
        cards.get(0).setPinCode(1234);
        cards.get(1).setPinCode(2234);
        cards.get(2).setPinCode(3234);
    }
}
