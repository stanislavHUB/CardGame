package ua.stas.service.impl;

import ua.stas.model.card.Card;

import java.util.Random;

public class Fight {
    static Random randInt = new Random();
    public static void attack(Card cardAttacker, Card cardDefence){
        if(cardAttacker.getSpeed()>cardDefence.getSpeed()){
            randomDodge(cardAttacker, cardDefence);
        }else if(cardAttacker.getSpeed()<cardAttacker.getSpeed()){
            randomDodge(cardAttacker, cardAttacker);
        }else{
            System.out.println("something went wrong");
        }
    }
    public static void randomDodge(Card cardAttacker, Card cardDefence){
        int myRandom = randInt.nextInt(100);
        myRandom = myRandom+1;
        if(cardDefence.getDodge()>cardAttacker.getPrecision()){
            System.out.println("You missed!");
        }else if(cardAttacker.getPrecision()>cardDefence.getDodge()){
            randomCrete(cardAttacker, cardDefence);
        }
    }
    public static void randomCrete(Card cardAttacker, Card cardDefence){
        int myRandom = randInt.nextInt(100);
        myRandom = myRandom+1;
        if(cardAttacker.getCrete()>cardDefence.getStamina()){
            System.out.println(cardAttacker.getName() + " attack " + cardDefence.getName() + " and give x2 damage");
            cardDefence.setHp(cardDefence.getHp() - cardAttacker.getDamage() * 2);
            System.out.println(cardDefence.getHp());
        }else if(cardDefence.getStamina()>cardAttacker.getCrete()){
            System.out.println(cardAttacker.getName() + " attack " + cardDefence.getName());
            cardDefence.setHp(cardDefence.getHp() - cardAttacker.getDamage());
            System.out.println(cardDefence.getHp());
        }
    }
}
