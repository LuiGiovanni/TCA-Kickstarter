public class Herencia{

    public static void main(String[] args){
        SerVivo sv = new SerVivo("Canis Lupus","Mammal");
        Animal lobo = new Animal("Lobo", sv.getGenus(),sv.getSpecies(),5);
        AnimalClonado loboClon = new AnimalClonado("Lobo",lobo.getGenus(),lobo.getSpecies(),3);
        Vegetal lechuga = new Vegetal("lechuga","Lactuca", "Lactuca sativa");
        
        sv.born();
        System.out.println(sv);
        System.out.println(lobo);
        System.out.println(loboClon);
        System.out.println(lechuga);
        for(int i=0;i<=12;i++){
            sv.grow();
        }
        sv.die();

    }
}