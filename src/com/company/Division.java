package com.company;
import java.util.*;

/**
 * Class Division
 */
public class Division {
    /** id */
    private final int id;
    /** name of division */
    private final String name;
    /** map fo storage of known id */
    private static final Map<String,Integer>  map=new HashMap<>();

    public Division(String name) {
        this.id = generateId(name);
        this.name = name;
    }

    /** генерирует id
     * @param name - name of division */
    private Integer generateId(String name){
        int Id = -1;
        assert false;
        if(!map.isEmpty() && map.containsKey(name)){
            Id= map.get(name);
        }
        else {
            Random r= new Random();
            Id=1000+r.nextInt(1000);
            while(map.containsValue(Id)){
                Id=1000+r.nextInt(1000);
            }
            map.put(name,Id);
        }
        return Id;
    }

    @Override
    public String toString() {
        return "{id=" + id +
                ", name='" + name + "'}";
    }
}
