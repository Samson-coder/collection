import java.util.*;
import java.io.*;
public class A{
    
    public static void main(String[] args){
        //insertion order not preserved
        Set<Integer> s = new HashSet<Integer>();
        s.add(20);
        s.add(10);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        System.out.println(s);
        s.addAll(Arrays.asList(new Integer[] {1,2,3,4}));
        System.out.println(s);
        s.remove(4);
        System.out.println(s.contains(20));
        for(Object obj:s){
            if(obj.equals(20)){
                System.out.println(obj);
            }
        }
        s.remove(3);
        System.out.println(s);
        System.out.println(s.size());
        
    }
}
