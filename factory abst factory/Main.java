public class Main {
    public static void main(String[] args) {
//        Cars bmw= new Cars.CarsBuilder()
//                .setName("Bmw")
//                .build();
//        Cars mers= new Cars.CarsBuilder()
//                .setName("Mersedes")
//                .build();
//        System.out.println(bmw);
//        System.out.println(mers);
        CarCreate BmwFactory = new BmwFactory();
        Car Bmw = BmwFactory.createCar();
        Bmw.drive();
        Engine BmwEngine = new BmwEngine();
        BmwEngine.start();
        System.out.println("-------");
        CarCreate MersFactory = new MersFactory();
        Car Mers = MersFactory.createCar();
        Mers.drive();
        Engine MersEngine = new MersEngine();
        MersEngine.start();
    }
}