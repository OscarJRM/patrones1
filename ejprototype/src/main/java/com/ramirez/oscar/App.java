package com.ramirez.oscar;

public class App 
{
    public static void main( String[] args )
    {
        Producto product1 = new Producto();
        product1.setName("Lavadora");
        product1.setPrice(1000);
        product1.setStock(10);

        Producto product2 = (Producto) product1.clone();

        System.out.println(product1);
        System.out.println(product2);
        System.out.println("--------------------------------------------------------");
        product2.setName("Secadora");
        product2.setPrice(1100);
        System.out.println(product1);
        System.out.println(product2);
        

    }
}
