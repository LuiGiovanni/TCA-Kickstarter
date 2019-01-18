public class AnimalClonado extends Animal{
    protected int i;
    protected String g;
    protected String s;
    protected String animal;

    public AnimalClonado(String animal,String g,String s,int i){
        super(animal,g,s,i);
        this.i = i;
        this.g = g;
        this.s = s;
        this.animal = animal;
    }
    protected void born(){
        alive = true;
    }
}