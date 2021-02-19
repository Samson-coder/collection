import java.util.*;
import java.io.*;
public class Collection{
    public static void main(String[] args){
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("lion");
        animal.add("dog");
        animal.add("cat");
        animal.add("cow");
        animal.add("pig");
        animal.add("mouse");
        //getting element
        String s = animal.get(4);
        System.out.println(s);
        //setting value
        animal.set(2,"tiger");
        for(String an : animal){
            System.out.println(an);
        }
    }
}
