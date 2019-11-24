package model;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Engine Started");
    }

    public void accelerate(){
        System.out.println("Accelerate");
    }

    public void theBreak(){
        System.out.println("Break");
    }

}

class Kia extends Car{

    public Kia() {
        super("Kia", 12);
    }

    @Override
    public void startEngine() {
        System.out.println("Kia Start engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Kia Stop engine");
    }

    @Override
    public void theBreak() {
        System.out.println("Break break break");
    }
}
