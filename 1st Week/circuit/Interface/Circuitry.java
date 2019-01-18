import java.util.Random;

public class Circuitry{

    public static void main(String[] args){
        int n = 6;
        Circuit c[] = new Circuit[6];
        Random rand = new Random();
        Circuit c1 = new T4512(1 + (100 - 1) * rand.nextDouble(), 1 + (100 - 1) * rand.nextDouble());
        Circuit c2 = new T4512(1 + (100 - 1) * rand.nextDouble(), 1 + (100 - 1) * rand.nextDouble());
        Circuit c3 = new T4512(1 + (100 - 1) * rand.nextDouble(), 1 + (100 - 1) * rand.nextDouble());
        Circuit c4 = new T4505(1 + (100 - 1) * rand.nextDouble(), 1 + (100 - 1) * rand.nextDouble());
        Circuit c5 = new T4505(1 + (100 - 1) * rand.nextDouble(), 1 + (100 - 1) * rand.nextDouble());
        Circuit c6 = new T4505(1 + (100 - 1) * rand.nextDouble(), 1 + (100 - 1) * rand.nextDouble());
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        c[3] = c4;
        c[4] = c5;
        c[5] = c6;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        SerialCircuit sc1 = new SerialCircuit(c1,c4);
        System.out.println(sc1);

        SerialCircuit sc2 = new SerialCircuit(c,n);
        System.out.println(sc2);

        ParallelCircuit pc1 = new ParallelCircuit(c1,c4);
        System.out.println(pc1);

        ParallelCircuit pc2 = new ParallelCircuit(c,n);
        System.out.println(pc2);


    }
}