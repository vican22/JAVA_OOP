package model;

public class Room {
    private Wall wall;
    private Bed bed;
    private Light light;

    public Room(Wall wall, Bed bed, Light light) {
        this.wall = wall;
        this.bed = bed;
        this.light = light;
    }

    public void clearRoom(){
        bed.makeBed();

        turnLightOff();
    }

    private void turnLightOff() {
        light.turnLightOff();
    }
}
