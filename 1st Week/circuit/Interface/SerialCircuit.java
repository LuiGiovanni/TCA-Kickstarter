public class SerialCircuit implements Circuit{
    long serialVersionUID = -4835751220302428904L;
    double volt;
    double current;
    double totalResistance;
    double resistance[] = new double[10];
    int sizeOfCircuit;

    public SerialCircuit(Circuit c[], int n){
        totalResistance = 0;
        for(int j=0;j<n;j++){
            resistance[j] = c[j].getResistance();
        }
        sizeOfCircuit = n;
    }

    public SerialCircuit(Circuit c1, Circuit c2){
        totalResistance = 0;
        resistance[0] = c1.getResistance();
        resistance[1] = c2.getResistance();
        sizeOfCircuit = 2;
    }

    public double getResistance(){
        for(int i=0;i<sizeOfCircuit;i++){
            totalResistance = totalResistance + resistance[i];
        }
        return totalResistance;
    }
    
    public String toString(){
        return "The total resistance in this serial circuit is: " + getResistance() + ", with a size of " + sizeOfCircuit + " circuits";
    }
}