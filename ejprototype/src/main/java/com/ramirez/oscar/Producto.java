package com.ramirez.oscar;

public class Producto implements IProducto {
    private String name;
    private double price;
    private int stock;

    // contructors

    public Producto() {
    }

    public Producto(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    // getters and setters

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }

    @Override
    public IProducto clone() {
        Producto clone = new Producto();
        clone.setName(this.getName());
        clone.setPrice(this.getPrice());
        clone.setStock(this.getStock());
        return clone;
    }

}
