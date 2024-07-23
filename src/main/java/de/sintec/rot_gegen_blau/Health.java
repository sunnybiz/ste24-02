package de.sintec.rot_gegen_blau;

public class Health {
    public Boolean getHealth() {
        return health;
    }

    public void setHealth(Boolean health) {
        this.health = health;
    }

    private Boolean health;

    public Health(Boolean health) {
        this.health = health;
    }
}
