package ua.stas.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name = "defoltName";
    @Column(name = "server")
    private int server;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "level")
    private int level = 1;
    @Column(name = "silver")
    private Long silver = 10000L;
    @Column(name = "gold")
    private Long gold = 280L;
    @Column(name = "exp")
    private Long exp = 0L;
    @Column(name = "energy")
    private Long energy = 120L;
    @Column(name = "energy_max")
    private int energyMax = 120;
    @Column(name = "formation_id")
    private Long formationId = 0L;
    @Column(name = "online_time")
    private Long onlineTime = 0L;
    @Column(name = "last_energy_time")
    private Long lastEnergyTime = 0L;
    @Column(name = "last_regular_campaign")
    private Integer lastRegularCampaign = 0;
    @Column(name = "last_regular_stage")
    private Integer lastRegularStage = 0;
    @Column(name = "opened_packs")
    private Integer openedPacks = 0;
    @Column(name = "current_challenge_campaign")
    private Integer currentChallengeCampaign;
    @Column(name = "current_challenge_stage")
    private Integer currentChallengeStage;
    @Column(name = "current_challenge_phase")
    private Integer currentChallengePhase;

    public Player(String name, int server, Long userId) {
        this.name = name;
        this.server = server;
        this.userId = userId;
    }

    public Player() {}

    public void addExp(Integer exp) {
        this.exp += exp;
    }

    public void addLevel() {
        this.level += 1;
    }

    public void addSilver(Integer amount) {
        this.silver += amount;
    }

    public void decreaseSilver(Integer amount) {
        this.silver -= amount;
    }

    public void addGold(Integer amount) {
        this.gold += amount;
    }

    public void decreaseGold(Integer amount) {
        this.gold -= amount;
    }

    public void addEnergy(Long energy) {
        this.energy += energy;
    }

    public void addOpenedPacks() { this.openedPacks += 1; }

    public Integer getCurrentChallengeCampaign() {
        return currentChallengeCampaign;
    }

    public void setCurrentChallengeCampaign(Integer currentChallengeCampaign) {
        this.currentChallengeCampaign = currentChallengeCampaign;
    }

    public Integer getCurrentChallengeStage() {
        return currentChallengeStage;
    }

    public void setCurrentChallengeStage(Integer currentChallengeStage) {
        this.currentChallengeStage = currentChallengeStage;
    }

    public Integer getCurrentChallengePhase() {
        return currentChallengePhase;
    }

    public void setCurrentChallengePhase(Integer currentChallengePhase) {
        this.currentChallengePhase = currentChallengePhase;
    }
}
