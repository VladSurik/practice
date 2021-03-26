package com.company;

public class Bank {
    private double count;
    private String name;


    public Bank(String name, double count) {
        this.count = count;
        this.name = name;

    }

    public void add(double money) {
        count += money;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }

    public double getCount() {
        return count;
    }
}
