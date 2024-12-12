package com.domain.models.repost;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);

    product save(ProductRepo product);
    

}
