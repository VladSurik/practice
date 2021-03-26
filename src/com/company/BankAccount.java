package com.company;
public class BankAccount {

    private String name;
    private double count;
    private Bank bank;

    public double getCount() {
        return count;
    }
    public BankAccount() {
    }

    public BankAccount(Bank bank, String name, double count) {
        this.name = name;
        this.count = count;
        this.bank = bank;
    }

    // 0.5% commission
    public void add(double money) {
        count += money * 99.5;
        bank.add(money /100 * 0.5);
    }

    // 1% commission
    public void transfer(BankAccount otherPerson, double money) {
        count -= money;
        bank.add(money - (money /100 * 99));
        otherPerson.count += money /100 * 99;

    }
}


