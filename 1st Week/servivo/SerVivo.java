public class SerVivo{
    protected String genus;
    protected String species;
    protected boolean alive;
    protected int age;

    public SerVivo(String g,String s){
        this.genus = g;
        this.species = s;
        alive = false;
        age = 0;
    }

    protected void born(){
        alive = true;
        age = 1;
        System.out.println("The being was born.");
    }

    protected void grow(){
        age = age + 1;
    }

    protected void die(){
        alive = false;
        System.out.println("The being died at the age of  " + age);
        age = 0;
    }

    protected boolean isAlive(){
        return alive;
    }

    protected String getGenus(){
        return genus;
    }

    protected String getSpecies(){
        return species;
    }

    protected int getAge(){
        return age;
    }

    public String toString(){
        return genus + ", " + species + ", " + alive + ", " + age;
    }
}