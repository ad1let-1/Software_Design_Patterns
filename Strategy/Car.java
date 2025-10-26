public abstract class Car {
    private DriveStrategy strategy;

    protected Car(DriveStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(DriveStrategy strategy) {
        if (strategy == null) throw new IllegalArgumentException("Strategy cannot be null");
        this.strategy = strategy;
    }

    public void performDrive() {
        strategy.drive();
    }

    public abstract String name();
}
