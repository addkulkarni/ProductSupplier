package com.productsupplier.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.productsupplier.app.model.Product;
import com.productsupplier.app.model.Supplier;
import com.productsupplier.app.servicei.ProductServiceI;
import com.productsupplier.app.servicei.SupplierServiceI;

@Controller
public class HomeController
{
	@Autowired
	SupplierServiceI ssi;
	
	@Autowired
	ProductServiceI psi;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "home";
	}
	
	
	@RequestMapping("home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addproduct")
	public String addproduct(ModelMap m)
	{
		List<Supplier> l = ssi.getsupplier();
	    m.put("data", l);
		
		return "addproduct";
	}
	
	@RequestMapping("viewproduct")
	public String viewproduct(ModelMap m)
	{
		List<Product> l = psi.getproduct();
		m.put("data", l);
		return "viewproduct";
	}
	
	@RequestMapping("addsupplier")
	public String addsupplier()
	{
		return "addsupplier";
	}
	
	@RequestMapping("savesupplier")
	public String savesupplier(@ModelAttribute Supplier s)
	{
		ssi.savesupplier(s);
		return "home";
	}
	
	@RequestMapping("saveproduct")
	public String saveproduct(@ModelAttribute Product p)
	{
		psi.saveproduct(p);
		return "home";
	}
	
	@RequestMapping("deleteproduct")
	public String deleteproduct(@RequestParam("pid") int pid, ModelMap m)
	{
		List<Product> list = psi.deleteproduct(pid);	
		m.put("data", list);
		return "viewproduct";
	}
	
	@RequestMapping("deletesupplier")
	public String deletesupplier(@RequestParam ("sid") int sid, ModelMap m)
	{
		List<Supplier> list = ssi.deletesupplier(sid);
		m.put("data", list);
		return "viewsupplier";
	}
	
	@RequestMapping("editproduct")
	public String editproduct(@RequestParam("pid") int pid, ModelMap m)
	{
		Product p = psi.editproduct(pid);
		List<Supplier> l = ssi.getsupplier();
		int selectedid=p.getS().getSid();
		
		m.put("selectedid", selectedid);
		
		System.out.println("Id of selected entity is"+selectedid);
		m.put("pro", p);
		m.put("data", l);
		return "editproduct";
	}
	
	@RequestMapping("updateproduct")
	public String updateProduct(@ModelAttribute Product p,ModelMap m)
	{
		List<Product> l = psi.updatedata(p);
		m.put("data", l);
		return "viewproduct";
	}
	
	@RequestMapping("editsupplier")
	public String editsupplier(@RequestParam("sid")int sid, ModelMap m)
	{
		Supplier s = ssi.editdata(sid);
		m.put("s", s);
		return "editsupplier";
	}
	
	@RequestMapping("updatesupplier")
	public String updatesupplier(@ModelAttribute Supplier s,ModelMap m)
	{
		List<Supplier> l = ssi.updatedata(s);
		m.put("data", l);
		return "viewsupplier";
	}
	
	@RequestMapping("viewsupplier")
	public String viewsupplier(ModelMap m)
	{
		List<Supplier> l = ssi.getsupplier();
		m.put("data", l);
		return "viewsupplier";
	}
	
	@RequestMapping("paging")
	public String paging(@RequestParam("pageno") int pageno, ModelMap m)
	{
		List<Supplier> list = ssi.pagingSupplier(pageno);
		m.put("data",list);
		return "viewsupplier";
	}
}
