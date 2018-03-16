package edu.myproject.smartbuy.repository;

import edu.myproject.smartbuy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
