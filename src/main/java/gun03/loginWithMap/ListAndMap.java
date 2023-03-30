package gun03.loginWithMap;

import java.util.*;

public class ListAndMap {

    public static void main(String[] args) {
        int[] arr = {1,2};
        arr[0] = 5;

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.add(6);
        list.add(7);
        list.set(1, 10);


        Map<String, String> map = new HashMap<>();
        map.put("Name", "Ali");
        map.put("Adress", "Ist");
        map.put("Age", "12");

        map.forEach((k,v)->{
            System.out.println(k + ", " + v + " --- " + map.get(k));
        });



    }
}
