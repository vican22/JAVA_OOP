package model;

public class Bed {
    private Dimensions dimensions;
    private String sheetColor;

    public Bed(Dimensions dimensions, String sheetColor) {
        this.dimensions = dimensions;
        this.sheetColor = sheetColor;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getSheetColor() {
        return sheetColor;
    }

    public void makeBed() {
        System.out.println("Make Bad");
    }
}
