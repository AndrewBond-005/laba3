package additional;

enum Size {
    SMALL(13, 14.5),
    MEDIUM(15, 17.5),
    LARGE(18, 20);
    final private double minSize;
    final private double maxSize;

    Size(double minSize, double maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public double getMinSize() {
        return minSize;
    }

    public double getMaxSize() {
        return maxSize;
    }
}
