public class Cuv extends Body{
    public Cuv (Color color){
        super(color);
    }
    @Override
    public void create(){
        System.out.println("CUV");
        color.fillColor();
    }
}