package com.productsupplier.app.servicei;

import java.util.List;

import com.productsupplier.app.model.Product;
import com.productsupplier.app.model.Supplier;

public interface SupplierServiceI
{

	void savesupplier(Supplier s);

	List<Product> getproduct();

	List<Supplier> getsupplier();

	List<Supplier> deletesupplier(int sid);

	Supplier editdata(int sid);

	List<Supplier> updatedata(Supplier s);

	List<Supplier> pagingSupplier(int pageno);

}
