public class Cadillac implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Cadillac is driving!");
    }

    public void clean() {
        System.out.println("Cadillac is being cleaned via adapter!");
    }
}
