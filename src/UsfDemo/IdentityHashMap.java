package UsfDemo;

import java.util.*;

public class IdentityHashMap extends HashMap{

    
    public static void main(String[] args)  {
        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put("A", new Double(1.1));
        ihm.put("C", new Double(3.3));
        ihm.put("B", new Double(2.2));
        ihm.put("D", new Double (4.4));
        Set s=ihm.entrySet();
        Iterator it= s.iterator();
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey()+ ":" + me.getValue());            
        }
        double bal = (Double)ihm.get("C");
        ihm.put("C", new Double(bal+10));
        System.out.println("New value of C: " + ihm.get("C"));        
    }
}
