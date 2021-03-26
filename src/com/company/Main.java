package com.company;

public class Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(1, 35);
        TimeSpan t2 = new TimeSpan(1, 45);
        TimeSpan t3 = new TimeSpan(1, 15);
        t1.add(t2);
        System.out.println(t1.toString());
        t1.sub(t3);
        System.out.println(t1.toString());
        t1.mult(0.5);
        System.out.println(t1.toString());

        Bank pb = new Bank("PB",0);
        BankAccount boss = new BankAccount(pb,"Oleg", 0);
        BankAccount ivan = new BankAccount(pb,"Ivan", 0);
        BankAccount alex = new BankAccount(pb,"Alex", 0);
        BankAccount sergey = new BankAccount(pb,"Sergey", 0);
        boss.add(100000);
        boss.transfer(ivan, 10000);
        boss.transfer(alex, 15000);
        boss.transfer(sergey, 20000);

        System.out.println(boss.getCount());
        System.out.println(ivan.getCount());
        System.out.println(alex.getCount());
        System.out.println(sergey.getCount());
        System.out.println("bank profit:" + pb.getCount());


    }
}


