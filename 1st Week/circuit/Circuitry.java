import java.util.Random;

public class Circuitry{

    public static void main(String[] args){
        int n = 6;
        Circuit c[] = new Circuit[6];
        Random rand = new Random();
        Circuit c1 = new T4512(rand.nextInt(100)+1, rand.nextInt(100)+1);
        Circuit c2 = new T4512(rand.nextInt(100)+1, rand.nextInt(100)+1);
        Circuit c3 = new T4512(rand.nextInt(100)+1, rand.nextInt(100)+1);
        Circuit c4 = new T4505(rand.nextInt(100)+1, rand.nextInt(100)+1);
        Circuit c5 = new T4505(rand.nextInt(100)+1, rand.nextInt(100)+1);
        Circuit c6 = new T4505(rand.nextInt(100)+1, rand.nextInt(100)+1);

        System.out.println(c1);
        System.out.println(c4);

        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        c[3] = c4;
        c[4] = c5;
        c[5] = c6;

        System.out.println(c1.getCurrent());

        SerialCircuit sc = new SerialCircuit(c);
    }
}