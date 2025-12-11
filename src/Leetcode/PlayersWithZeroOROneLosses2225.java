package Leetcode;

import java.util.*;

public class PlayersWithZeroOROneLosses2225 {

    public static void main(String[] args) {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> resultList =  findWinners(matches);
        System.out.println(resultList);
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> zeroLosses = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] match : matches) {
            map.put(match[0], map.getOrDefault(match[0], 0));
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 0) {
                zeroLosses.add(i);
            } else if (map.get(i) == 1) {
                oneLose.add(i);
            }
        }
        Collections.sort(zeroLosses);
        Collections.sort(oneLose);
        return Arrays.asList(zeroLosses, oneLose);
    }

}
