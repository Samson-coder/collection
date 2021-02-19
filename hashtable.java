import java.util.*;
import java.io.*;
public class Collection{
    public static void main(String[] args){
        Hashtable<String, Integer> hs = new Hashtable<String, Integer>();
        hs.put("Guru",90990988);
        hs.put("Abi",9987787);
        hs.put("Surya",79765656);
        hs.put("jerome",98988868);
        System.out.println(hs);
        hs.remove("Surya");
        System.out.println(hs);
    }
}
