package org.javaro.lecture.a261105;

class Drink {
    String product; int price; int quantity;
    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return this.product;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return this.price * this.quantity;
    }

    static void printTitle() {
        System.out.println("제품명\t단가\t수량\t금액");
    }

    void printData() {
        System.out.println(this.product + "\t" + this.price + "\t" + this.quantity + "\t" + getTotal());
    }
}

public class Ex8_13_2 {
    public static void main(String[] args) {
        Drink coke = new Drink();
        coke.setProduct("콜라"); coke.setPrice(2000); coke.setQuantity(15);
        Drink.printTitle();
        coke.printData();
        Drink tea = new Drink();
        tea.setProduct("녹차"); tea.setPrice(3000); tea.setQuantity(20);
        tea.printData();
    }
}
