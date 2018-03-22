package edu.myproject.smartbuy.service;

import edu.myproject.smartbuy.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product findById(Integer id);

    Page<Product> findAllProductsPageable(Pageable pageable);

}
