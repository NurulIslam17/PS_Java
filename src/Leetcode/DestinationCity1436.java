package Leetcode;

import java.util.*;

public class DestinationCity1436 {

    public static void main(String[] args) {
        String[][] paths = {{"London", "New York"}, {"New York", "Lima"}, {"Lima", "Sao Paulo"}};
        //  String[][] paths = {{"B","C"}, {"D","B"}, {"C","A"}};
        System.out.println(destCity(paths));
    }

    public static String destCity(String[][] paths) {
        Set<String> from = new HashSet<>();
        for (String[] dest : paths) {
            from.add(dest[0]);
        }
        System.out.println(from);
        for (String[] to:paths)
        {
           if (!from.contains(to[1]))
           {
               return to[1];
           }
        }
        return "";
    }
}
