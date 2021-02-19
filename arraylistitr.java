import java.util.*;
import java.io.*;
public class Collection{
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        //iterator
        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
