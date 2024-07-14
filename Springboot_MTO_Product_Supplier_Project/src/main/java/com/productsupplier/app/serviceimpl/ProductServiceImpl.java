package com.productsupplier.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsupplier.app.model.Product;
import com.productsupplier.app.repository.ProductRepository;
import com.productsupplier.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI
{
	@Autowired
	ProductRepository pr;
	
	@Override
	public List<Product> getproduct()
	{
		
		return (List<Product>) pr.findAll();
	}

	@Override
	public void saveproduct(Product p)
	{
		pr.save(p);
		
		
	}

	@Override
	public List<Product> deleteproduct(int pid)
	{
		pr.deleteById(pid);
		return (List<Product>) pr.findAll();
	}

	@Override
	public Product editproduct(int pid)
	{
		return pr.findById(pid).get();
	}

	@Override
	public List<Product> updatedata(Product p)
	{
		pr.save(p);
		return (List<Product>) pr.findAll();
	}
}
