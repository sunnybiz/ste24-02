package de.sintec.rot_gegen_blau;

public class Move {
    private String field;
    private String state;

    public String getField() {
        return field;
    }
    public String getState() {
        return state;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Move(String field, String state) {
        this.field = field;
        this.state = state;
    }
}
