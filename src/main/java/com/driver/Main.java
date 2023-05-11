package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly name = new RWOnly();

        name.setName("suraj prakash");

        String collector = name.getName();
        System.out.println(collector);


    }
}