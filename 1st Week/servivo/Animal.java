public class Animal extends SerVivo{
    protected String g;
    protected String s;
    protected int i;

    public Animal(String g,String s,int i){
        super(g,s);
        this.g = g;
        this.s = s;
        this.i = i;
    }

    public int getInstinct(){
        return i;
    }

    public String toString(){
        return g + ", " + s + ", " + i;
    }
}