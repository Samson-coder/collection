import java.util.*;
import java.io.*;
public class A {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lm = new LinkedHashMap<Integer,String>();
        lm.put(1,"ghg");
        lm.put(6,"hygyg");
        lm.put(7,"uhuh");
        lm.put(3,"yh");
        lm.put(9,"ujj");
        lm.put(2,"gyhj");
        System.out.println(lm);
        lm.put(1,"jjuj");
        lm.remove(9);
        System.out.println(lm);
        for(Map.Entry m : lm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(lm.keySet());
        System.out.println(lm.values());
        System.out.println(lm.entrySet());
        System.out.println(lm.containsKey(2));
        
    }
}
