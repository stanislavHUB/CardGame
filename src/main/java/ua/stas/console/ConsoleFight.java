package ua.stas.console;

import ua.stas.model.card.Card;
import ua.stas.model.card.Equipment;
import ua.stas.model.card.TypeOfCard;
import ua.stas.service.impl.Fight;

public class ConsoleFight {
    public static Card card1 = new Card("Card 1", "Photo", TypeOfCard.ATTACKER, new Equipment("Sword", "photo", 150, "1"),
            new Equipment("SomeArmor1", "photo", 150, "2"), new Equipment("Shield", "photo", 150, "3"),
            150, 56000, 16000, 1000, 2000, 2000, 2000, 500, 500, 100);
    public static Card card2 = new Card("Card 2", "Photo", TypeOfCard.ARMOR, new Equipment("Axe", "photo", 150, "1"),
            new Equipment("SomeArmor2", "photo", 150, "2"), new Equipment("None", "photo", 0, "3"),
            150, 80000, 13400, 800, 2000, 2000, 1000, 5500, 500, 100);

    public static void consoleFight(){
        Fight.attack(card1, card2);
    }
}
