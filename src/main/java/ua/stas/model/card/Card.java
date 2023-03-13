package ua.stas.model.card;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String photo;
    private TypeOfCard type;
    private Equipment weaponEquip;
    private Equipment armorEquip;
    private Equipment extraEquip;
    private int lvl;
    private int hp; // ХП
    private int damage; // Атака (чистий урон від карти)
    private double speed; // Швидкість (Рішає яка карта нападе перша)
    private int pierce; // Пробій (добавляє урон якщо в противника меньше броні
    private int armor; // Броня (Ріже чистий урон від карти супротивника)
    private int precision; // Влучність (Якщо влучності більше чим уклону, то більше шансів що ви попадете по карті)
    private int dodge; // Уклон (Чим більше уклону, тим більше шансів що по карті не попадуть)
    private int crete; // х2 урон (Якщо крита більше чим витривалості, то є велики шанс на х2 урон)
    private int stamina; // Витривалість (Чим більше витривалості, тим більше шансів що небуде х2 урону)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // Якщо показники рівні то шанс на них 25 відсотків

    public Card(String name, String photo, TypeOfCard type, Equipment weaponEquip, Equipment armorEquip, Equipment extraEquip,
                int lvl, int hp, int damage, double speed, int pierce, int armor, int precision, int dodge, int crete, int stamina) {
        this.name = name;
        this.photo = photo;
        this.type = type;
        this.weaponEquip = weaponEquip;
        this.armorEquip = armorEquip;
        this.extraEquip = extraEquip;
        this.lvl = lvl;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.pierce = pierce;
        this.armor = armor;
        this.precision = precision;
        this.dodge = dodge;
        this.crete = crete;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Card: " + name + lvl +
                " hp=" + hp +
                " damage=" + damage;
    }
}
