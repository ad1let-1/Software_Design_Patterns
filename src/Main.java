public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Cadillac cadillac = new Cadillac();
        CarWash carWash = new CarWash();

        System.out.println("Washing BMW directly");
        carWash.wash(bmw);
        System.out.println("");
        System.out.println("Using adapter to wash Cadillac ");
        BMW adaptedCadillac = new CadillacAdapter(cadillac);
        carWash.wash(adaptedCadillac);
    }
}