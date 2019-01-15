public class SerialCircuit implements Circuit{
    long serialVersionUID = -4835751220302428904L;
    double volt;
    double current;

    // To calculate the total voltage of all circuits in series:
    // Vt = v1 + v2 + v3 + ... +vn

    // The current in a series circuit is the same for all elements

    public SerialCircuit(Circuit c[]){
        System.out.println(c[0]);
    }

    public SerialCircuit(Circuit c1, Circuit c2){

    }

    public double getResistance(){
        return volt / current;
    }
    /*
    public String toString(){

    }*/
}