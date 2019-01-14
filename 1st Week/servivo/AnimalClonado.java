public class AnimalClonado extends Animal{
    protected int i;
    protected String g;
    protected String s;

    public AnimalClonado(String g,String s,int i){
        super(g,s,i);
        this.i = i;
        this.g = g;
        this.s = s;
    }
    protected void born(){
        alive = true;
    }
}