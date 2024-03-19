package org.xproce.revormclass.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.revormclass.dao.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
