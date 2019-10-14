package com.hdd.service;

import com.hdd.model.Category;
import com.hdd.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void remove(Long id);

    Iterable<Product> findAllByCategory(Category category);

}
