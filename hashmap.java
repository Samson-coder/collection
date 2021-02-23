import java.util.*;
import java.io.*;
public class A {
    public static void main(String[] args){
        HashMap<Integer,String> hs = new HashMap<Integer,String>();
        hs.put(1,"David");
        hs.put(2,"Ashik");
        hs.put(3,"deva");
        hs.put(4,"vino");
        System.out.println(hs.remove(3));
        hs.put(3,"raj");
        System.out.println(hs);
        System.out.println(hs.get(2));
        System.out.println(hs.size());
        for(int i : hs.keySet()){
            System.out.println(i);
        }
        
    }
}
