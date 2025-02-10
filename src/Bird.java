public class Bird {
    private double height;
    private double weight;
    private double wingspan;

    public Bird(double height, double weight, double wingspan) {
        this.height = height;
        this.weight = weight;
        this.wingspan = wingspan;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return String.format(" Bird{height=%.2f, weight=%.2f, wingspan=%.2f}", height, weight, wingspan);
    }
}
