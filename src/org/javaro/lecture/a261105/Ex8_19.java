package org.javaro.lecture.a261105;

class Wallet {
    static int amount = 0;

    public void save(int amount) {
        Wallet.amount += amount;
    }

    public static void spend(int amount) {
        Wallet.amount -= amount;
    }

    public static int getAmount() {
        return Wallet.amount;
    }
}

public class Ex8_19 {

    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.save(100);
        Wallet.spend(10);
        w.save(50);
        Wallet.spend(200);
        System.out.println(Wallet.getAmount());
    }
}
