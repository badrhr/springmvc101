package org.xproce.revormclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.revormclass.dao.entities.Product;
import org.xproce.revormclass.service.ProductManager;

@SpringBootApplication
public class RevormclassApplication implements CommandLineRunner {

    @Autowired
    private ProductManager productManager;

    public static void main(String[] args) {
        SpringApplication.run(RevormclassApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "msi", 1223.0);
        Product product1 = new Product(null, "dell", 1235.0);
        Product product2 = new Product(null, "hp", 1823.0);
        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);

        System.out.println(productManager.getAllProducts());

    }
}
