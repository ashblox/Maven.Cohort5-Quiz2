package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> unique = new HashSet<>();
        for (Integer entry: list) {
            unique.add(entry);
        }
        List<Integer> modified = new ArrayList<>();
        for (Integer entry: unique) {
            modified.add(entry);
        }
        return modified;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
