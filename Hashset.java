package com.OasisProject;

import java.util.HashSet;
import  java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        //add
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(3);

        //size
        System.out.println("size of a set ="+set.size());

        //search
        if(set.contains(6)){
            System.out.println("contain 6");
        }else  if(set.contains(3)){
            System.out.println("contain 3");
        }

//        delete
        set.remove(3);
//        print all set
        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ,");
        }
//        isEmpty
            if(set.isEmpty()){
                System.out.println("set is empty");
            }


    }

}
