package org.example;


public class Main {
    public static void main(String[] args) {
        Hashmap<String, Integer> test = new Hashmap<>();
        test.put("12", 1);
        test.put("20",2);
        test.put("12",3);
        test.remove("20");
        System.out.println(test.get("12"));
        System.out.println(test.get("20"));
        System.out.println(test.containsKey("10"));
        System.out.println(test.containsKey("12"));
        System.out.println(test.containsValue(3));
        System.out.println(test.containsValue(10));
        System.out.println(test.size());
    }
}