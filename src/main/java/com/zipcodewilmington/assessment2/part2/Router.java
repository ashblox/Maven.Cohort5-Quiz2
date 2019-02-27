package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {

    private Map<String, String> map = new TreeMap<>();

    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        String key = "";
        for (Map.Entry<String, String> entry: map.entrySet()){
            if (entry.getValue() == path) {
                key = entry.getKey();
            }
        }
        return key;
    }

    public void update(String path, String studentController) {
        map.put(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
}
