package com.spring.example3;

public class MyProperties {
    private int quantity;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }
}
