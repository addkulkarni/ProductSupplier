package com.productsupplier.app.servicei;

import java.util.List;
import java.util.Optional;

import com.productsupplier.app.model.Product;
import com.productsupplier.app.model.Supplier;

public interface ProductServiceI
{

	List<Product> getproduct();

	void saveproduct(Product p);

	List<Product> deleteproduct(int pid);

	Product editproduct(int pid);

	List<Product> updatedata(Product p);

	

	

}
