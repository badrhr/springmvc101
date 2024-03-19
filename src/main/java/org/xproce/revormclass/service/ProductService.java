package org.xproce.revormclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xproce.revormclass.dao.entities.Product;
import org.xproce.revormclass.dao.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService implements ProductManager {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if (product.getPrice() > 0) {
            return productRepository.save(product);
        } else {
            System.out.println("the price is not valid");
            return null;
        }
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Product product) {
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
