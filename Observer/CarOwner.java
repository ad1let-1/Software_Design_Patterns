public class CarOwner implements Observer {
    private String name;

    public CarOwner(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(" " + name + " получил уведомление: " + message);
    }
}
