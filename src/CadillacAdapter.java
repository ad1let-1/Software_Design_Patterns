public class CadillacAdapter extends BMW {
    private Cadillac cadillac;

    public CadillacAdapter(Cadillac cadillac) {
        this.cadillac = cadillac;
    }

    @Override
    public void washCar() {
        System.out.println("Using adapter to wash Cadillac...");
        cadillac.clean();
    }
}
