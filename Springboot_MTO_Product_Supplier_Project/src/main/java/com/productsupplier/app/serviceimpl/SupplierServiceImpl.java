package com.productsupplier.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.productsupplier.app.model.Product;
import com.productsupplier.app.model.Supplier;
import com.productsupplier.app.repository.ProductRepository;
import com.productsupplier.app.repository.SupplierRepository;
import com.productsupplier.app.servicei.SupplierServiceI;

@Service
public class SupplierServiceImpl implements SupplierServiceI
{
	@Autowired
	SupplierRepository sr;

	@Autowired
	ProductRepository pr;
	@Override
	public void savesupplier(Supplier s)
	{
		sr.save(s);
		
	}
	@Override
	public List<Product> getproduct()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Supplier> getsupplier()
	{
		
		return (List<Supplier>) sr.findAll();
	}
	@Override
	public List<Supplier> deletesupplier(int sid)
	{
		sr.deleteById(sid);
		
		return (List<Supplier>) sr.findAll();
	}
	@Override
	public Supplier editdata(int sid)
	{
		
		return sr.findById(sid).get();
	}
	@Override
	public List<Supplier> updatedata(Supplier s)
	{
		sr.save(s);
		return (List<Supplier>) sr.findAll();
	}
	@Override
	public List<Supplier> pagingSupplier(int pageno)
	{
		Pageable pageable = PageRequest.of(pageno, 3, Sort.by("sname"));
		return sr.findAll(pageable).toList();
	}

	

}
