public class Animal extends SerVivo{
    protected String g;
    protected String s;
    protected int i;
    public String animal;

    public Animal(String animal,String g,String s,int i){
        super(g,s);
        this.g = g;
        this.s = s;
        this.i = i;
        this.animal = animal;

    }

    public int getInstinct(){
        return i;
    }

    public String toString(){
        return animal + ", " + g + ", " + s + ", " + i;
    }
}