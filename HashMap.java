package com.OasisProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapExample {
    public static void main(String[] args) {
        //Creation
        HashMap <String,Integer> map= new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);

        map.put("China",180);//updation of value
        System.out.println(map);

        //Searching
        if(map.containsKey("Indonesia")){
            System.out.println("key is present in map");
        }else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China"));//key exist
        System.out.println(map.get("Indonesia"));//key doesnot exist

        //Iteration (1)
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        Iteration (2)

        Set<String> keys= map.keySet();
        for (String key:keys){
            System.out.println(key+"   " +map.get(key));
        }

//        Removing
        map.remove("China");
        System.out.println(map);


    }
}
