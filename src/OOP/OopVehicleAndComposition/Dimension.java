package OOP.OopVehicleAndComposition;

public class Dimension {
    private int widht;
    private int height;
    private int depth;

    public Dimension(int widht, int height, int depth) {
        this.widht = widht;
        this.height = height;
        this.depth = depth;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
