package com.hampcode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.hampcode.business.IProductBusiness;
import com.hampcode.model.entity.Product;

@Named
@ViewScoped
public class ProductController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProductBusiness productBusiness;
	
	private List<Product> products;
	
	@PostConstruct
	public void init() {
		products = new ArrayList<>();
		getAllProducts();
	}
	
	public void getAllProducts() {
		try {
			products = productBusiness.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	

}
