package ua.stas.model.security;

public enum Permission {
    LOGIN("login"),
    PLAYER_CREATE("player:create"),
    PLAYER_GET("player:get"),
    PLAYER_GET_ALL("player:getAll"),
    PLAYER_GET_ALL_BY_SERVER("player:getAllByServer"),
    CARD_GET("card:get"),
    CARD_GET_ALL("card:getAll"),
    PROP_GET("prop:get"),
    PROP_GET_ALL("prop:getAll"),
    PLAYER_CARD_GET("playerCard:get"),
    PLAYER_CARD_GET_ALL("playerCard:getAll"),
    PLAYER_CARD_UPGRADE("playerCard:upgrade"),
    FORMATION_GET("formation:get"),
    FORMATION_GET_ALL("formation:getAll"),
    FORMATION_SET("formation:set"),
    LEGION_UPDATE_BATTLE_POINTS("legion:updateBattlePoints"),
    LEGION_GET_BASE_CARDS("legion:getBaseCards"),
    LEGION_GET_LEGIONS("legion:getLegions"),
    CAMPAIGN_START("campaign:start"),
    BAG_GET("bag:get"),
    CARD_PACK_OPEN("cardPack:open"),
    CARD_PACK_GET("cardPack:get"),
    BATTLE_START("battle:start"),
    API("api:full");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
