public class Main {
    public static void main(String[] args) {
        CarService service = new CarService();

        CarOwner john = new CarOwner("John");
        CarOwner emily = new CarOwner("Emily");
        CarOwner alex = new CarOwner("Alex");


        service.attach(john);
        service.attach(emily);
        service.attach(alex);

        service.newPromotion("Скидка 20% на замену масла!");
        service.carReady("Emily");

        service.detach(alex);

        service.newPromotion("Бесплатная диагностика двигателя!");
    }
}
