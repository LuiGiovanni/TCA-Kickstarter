public class T4505 implements Circuit{
    long serialVersionUID = 43425069015229294L;
    double current;
    double volt;
    
    public T4505(double current, double volt){
        this.current = current;
        this.volt = volt;
    }

    public double getResistance(){
        return volt / current;
    }

    public double getCurrent(){
        return current;
    }

    public double getVoltage(){
        return volt;
    }

    public String toString(){
        return "SerialVersion: " + serialVersionUID + ", Voltage: " + volt + ", Current: " + current + ", Resistance: " + getResistance();
    }
}