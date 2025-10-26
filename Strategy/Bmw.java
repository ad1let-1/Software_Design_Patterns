public class Bmw extends Car {
    public Bmw() {
        super(new SportDrive()); // default driving style
    }

    @Override
    public String name() {
        return "BMW";
    }
}
