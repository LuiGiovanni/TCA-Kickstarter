public class Herencia{

    public static void main(String[] args){
        Animal lobo = new Animal("Lobo", "Canis Lupus","Mammal",5);
        AnimalClonado loboClon = new AnimalClonado("Lobo",lobo.getGenus(),lobo.getSpecies(),3);
        Vegetal lechuga = new Vegetal("lechuga","Lactuca", "Lactuca sativa");
        
        lobo.born();
        System.out.println(lobo);
        for(int i=0;i<=12;i++){
            lobo.grow();
        }
        loboClon.born();
        System.out.println(loboClon);
        lobo.die();
        System.out.println(lechuga.photosynthesis());

    }
}