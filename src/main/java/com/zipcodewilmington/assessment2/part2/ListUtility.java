package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return new ArrayList<>(new HashSet<>(list));
    }

    public String join() {
        String concat = list.toString();
        return concat.substring(1, concat.length() - 1);
    }

    public Integer mostCommon() {
        Integer[] converted = new Integer[list.size()];
        ArrayUtility arrUtil = new ArrayUtility();
        return arrUtil.mostCommon(converted);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
