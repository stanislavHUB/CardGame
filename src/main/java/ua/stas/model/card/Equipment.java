package ua.stas.model.card;

import lombok.Data;

@Data
public class Equipment {
    private String name;
    private String photo;
    private EquipmentType equipmentType;
    private int lvl;
    private String description;

    public Equipment(String name, String photo, int lvl, String description) {
        this.name = name;
        this.photo = photo;
        this.lvl = lvl;
        this.description = description;
    }
}
