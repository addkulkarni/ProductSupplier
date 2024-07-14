package com.productsupplier.app.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.productsupplier.app.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>
{



}
