package com.ramirez.oscar;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    @Test
    public void testClonacionExitosa() {
        Producto product1 = new Producto("Lavadora", 1000, 10);
        Producto product2 = (Producto) product1.clone();

        // Verificar que los objetos son diferentes
        assertNotSame(product1, product2);

        // Verificar que los atributos son iguales
        assertEquals(product1.getName(), product2.getName());
        assertEquals(product1.getPrice(), product2.getPrice(), 0);
        assertEquals(product1.getStock(), product2.getStock());
    }

    @Test
    public void testIndependenciaEntreOriginalYClon() {
        Producto product1 = new Producto("Lavadora", 1000, 10);
        Producto product2 = (Producto) product1.clone();

        // Modificar el clon
        product2.setName("Secadora");
        product2.setPrice(1100);
        product2.setStock(8);

        // Verificar que el original no cambió
        assertEquals("Lavadora", product1.getName());
        assertEquals(1000, product1.getPrice(), 0);
        assertEquals(10, product1.getStock());
    }

    @Test
    public void testModificacionAtributosClon() {
        Producto product1 = new Producto("Lavadora", 1000, 10);
        Producto product2 = (Producto) product1.clone();

        // Modificar el clon
        product2.setName("Secadora");
        product2.setPrice(1100);
        product2.setStock(8);

        // Verificar que el clon cambió
        assertEquals("Secadora", product2.getName());
        assertEquals(1100, product2.getPrice(), 0);
        assertEquals(8, product2.getStock());
    }

    @Test
    public void testCreacionMultiplesClones() {
        Producto product1 = new Producto("Lavadora", 1000, 10);
        Producto product2 = (Producto) product1.clone();
        Producto product3 = (Producto) product1.clone();

        // Modificar los clones
        product2.setName("Secadora");
        product2.setPrice(1100);
        product3.setStock(8);

        // Verificar que los clones son independientes
        assertNotEquals(product1.getName(), product2.getName());
        assertNotEquals(product1.getPrice(), product2.getPrice(), 0);
        assertNotEquals(product1.getStock(), product3.getStock());
    }

    @Test
    public void testReferenciaDiferente() {
        Producto product1 = new Producto("Lavadora", 1000, 10);
        Producto product2 = (Producto) product1.clone();

        // Verificar que los objetos tienen diferente referencia de memoria
        assertNotSame(product1, product2);
    }
}
