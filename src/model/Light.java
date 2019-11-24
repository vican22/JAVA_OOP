package model;

public class Light {
    private int number;
    private String power;

    public Light(int number, String power) {
        this.number = number;
        this.power = power;
    }

    public int getNumber() {
        return number;
    }

    public String getPower() {
        return power;
    }

    public void turnLightOff(){
        System.out.println("Turn lights off");
    }
}
