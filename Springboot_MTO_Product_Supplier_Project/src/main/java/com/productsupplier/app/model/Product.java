package com.productsupplier.app.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private int pprice;
	@ManyToOne (cascade = CascadeType.PERSIST)
	private Supplier s;
	public int getPid()
	{
		return pid;
	}
	public void setPid(int pid)
	{
		this.pid = pid;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname)
	{
		this.pname = pname;
	}
	public int getPprice()
	{
		return pprice;
	}
	public void setPprice(int pprice)
	{
		this.pprice = pprice;
	}
	public Supplier getS()
	{
		return s;
	}
	public void setS(Supplier s)
	{
		this.s = s;
	}
	
}
