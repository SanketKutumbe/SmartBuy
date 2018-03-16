package edu.myproject.smartbuy.service.Impl;

import edu.myproject.smartbuy.model.Product;
import edu.myproject.smartbuy.repository.ProductRepository;
import edu.myproject.smartbuy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> findAllProductsPageable(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findOne(id);
    }

}

