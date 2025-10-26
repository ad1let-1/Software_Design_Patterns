public class Mercedes extends Car {
    public Mercedes() {
        super(new EcoDrive()); // default driving style
    }

    @Override
    public String name() {
        return "Mercedes";
    }
}
