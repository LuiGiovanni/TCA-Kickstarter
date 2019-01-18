public class Vegetal extends SerVivo{
    String g;
    String s;
    String name;

    public Vegetal(String name,String g,String s){
        super(g,s);
        this.g = g;
        this.s = s;
        this.name = name;
    }

    protected String photosynthesis(){
        return name + ", " + g + ", " + s;
    }
}
