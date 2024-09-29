import java.util.*;
//implementation of arrayList, hashset,hashmap--------------------------------------
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(85);
        list.add(45);
        list.add(35);
        System.out.println("Arraylist has "+list);
        HashSet<Integer> set = new HashSet<>();
        set.add(35);
        set.add(45);
        System.out.println("Hashset has "+set);
        HashMap<String,Integer> map = new HashMap<>();//key and value 
        map.put("sam", 63);
        map.put("krish",31);
        map.put("veronica",32);
        System.out.println("set has "+map);

    }
    
}

