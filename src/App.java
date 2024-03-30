import java.util.Scanner;

import Arithmetic.Arithmetic;
import Map.MyMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String op;

        MyMap<String, Integer> mp = new MyMap<>();
        String key;
        int value;

        do {
            System.out.print("Enter op: ");
            op = sc.nextLine();

            switch (op) {
                case "a":
                    System.out.println("Putting values in the map...");
                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    sc.nextLine();
                    mp.put(key, value);
                    break;
                case "g":
                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    // System.out.println(String.format("The value of key { %s } : %d", key,
                    // mp.get(key)));
                    System.out.println("The value of key { " + key + " } : " + mp.get(key));
                    break;
                case "r":
                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    // System.out.println(String.format("Key { %s } with value %d removed from the
                    // map", key, mp.remove(key)));
                    System.out.println("Key { " + key + " } : " + mp.remove(key));
                    break;
                case "p":
                    System.out.println("Map key-value pairs:  ");
                    mp.print();
                    break;
            }
        } while (!op.equals("x"));

        Arithmetic<Integer, Float> a = new Arithmetic<>(10, 20.50f);
        System.out.println(a.getMin());

        sc.close();
    }
}
