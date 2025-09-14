public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .model("Camry 55")
                .year(2020)
                .power("550 hp")
                .weight(1500)
                .build();

        System.out.println(car);
    }
}
