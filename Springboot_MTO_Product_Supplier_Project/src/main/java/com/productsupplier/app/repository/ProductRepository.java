package com.productsupplier.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.productsupplier.app.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>
{

}
