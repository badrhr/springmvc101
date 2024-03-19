package org.xproce.revormclass.service;

import org.xproce.revormclass.dao.entities.Product;
import java.util.List;

public interface ProductManager {
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public boolean deleteProduct(Product product);
    public List<Product> getAllProducts();
}
