package UsfDemo;

import java.util.BitSet;

public class BitSetExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BitSet bit1 = new BitSet(16);
        BitSet bit2 = new BitSet(16);
        System.out.println(bit1);
        System.out.println(bit2);
        for(int i=0; i<16; i++)
        {
            if (i%2==0)bit1.set(i);
            if(i%5!=0)bit2.set(i);
            System.out.println(i + "\t" + bit1 + "\t" + bit2 + "\t" + bit1.get(i) + "\t" + bit2.get(i));
            
        }
        System.out.println(bit1);
        for (int i = 0; i < 16; i++) {
        	if(bit1.get(i)) System.out.print("1");
        	if(!bit1.get(i)) System.out.print("0");
        	System.out.print(",");
        }
        System.out.print("\n");
        System.out.println(bit2);
        for (int i = 0; i < 16; i++) {
        	if(bit2.get(i)) System.out.print("1");
        	if(!bit2.get(i)) System.out.print("0");
        	System.out.print(",");
        }
        System.out.print("\n");
        bit2.and(bit1);
        System.out.println(bit2);
        bit2.or(bit1);
        System.out.println(bit2);
        bit2.xor(bit1);
        System.out.println(bit2);
    }

}
