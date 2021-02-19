import java.util.*;
import java.io.*;
public class Collection{
    public static void main(String[] args){
        ArrayList<String> animal = new ArrayList<String>();
       Vector<Integer> num = new Vector<Integer>();
       num.add(20);
       num.add(30);
       num.add(10);
       num.add(40);
       System.out.println(num);
       num.remove(1);
       System.out.println(num);
    }
}
