package model;

public class Printer {
    private int tonerLevel = -1;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int toner){
        if (this.tonerLevel + toner <= 100) {
            this.tonerLevel += toner;
            System.out.println("New toner level is " + this.tonerLevel);
            return;
        }

        System.out.println("Cannot add that much ink in printer");
    }

    public void printing(int pages) {

        if (this.isDuplex) {
            this.numberOfPagesPrinted += (pages / 2) + (pages % 2);
        } else {
            this.numberOfPagesPrinted += pages;
        }

        System.out.println("Number of printed pages: " + this.numberOfPagesPrinted);
    }
}
