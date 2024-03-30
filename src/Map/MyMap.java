package Map;

import java.util.ArrayList;

public class MyMap<T1, T2> {
    private ArrayList<T1> keys;
    private ArrayList<T2> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(T1 key, T2 value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(index, value);
        }
    }

    public T2 get(T1 key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        } else {
            return values.get(index);
        }
    }

    public T2 remove(T1 key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        } else {
            keys.remove(index);
            return values.remove(index);
        }
    }

    // For purpose of testing input

    public void print() {
        if (keys.size() == 0)
            System.out.println("Empty.");
        for (int i = 0; i < keys.size(); i++) {
            // System.out.println(String.format("{ %s } : %d", keys.get(i), values.get(i)));
            System.out.println(keys.get(i) + " : " + values.get(i));
        }
    }
}
