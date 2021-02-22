import java.util.*;
import java.io.*;
public class A{
    
    public static void main(String[] args){
        LinkedList<Integer> li = new LinkedList<Integer>();
        LinkedList<Integer> li1 = new LinkedList<Integer>();
        LinkedList<Integer> li2 = new LinkedList<Integer>();
        
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.remove(1);
        System.out.println(li);
    
        
        li1.add(50);
        li1.add(60);
        li1.addAll(li);
        System.out.println(li1);
        
        li2.add(50);
        li2.add(60);
        li2.addAll(2,li2);
        System.out.println(li2);
        
    }
}
