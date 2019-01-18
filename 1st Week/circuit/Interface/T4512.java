public class T4512 implements Circuit{
    long serialVersionUID = 4265903298035016995L;
    double current;
    double volt;
    
    public T4512(double current, double volt){
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