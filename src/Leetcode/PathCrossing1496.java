package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing1496 {

    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> co_ordinate = new HashSet<>();
        int x = 0;
        int y = 0;
        co_ordinate.add(x+","+y);
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if(c == 'W') {
                x--;
            }
            String setCoordinate = x + "," + y;
            if (co_ordinate.contains(setCoordinate)) {
                return true;
            }
            co_ordinate.add(setCoordinate);
        }
        return false;
    }

}
