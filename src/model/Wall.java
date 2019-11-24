package model;

public class Wall {
    private int number;
    private String colour;

    public Wall(int number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public String getColour() {
        return colour;
    }
}
