public class BmwFactory extends CarCreate {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
