package com.hampcode.business.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.hampcode.business.IProductBusiness;
import com.hampcode.model.entity.Product;
import com.hampcode.model.repository.IProductRepository;

@Named
public class ProductBusiness implements IProductBusiness,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IProductRepository productRepository;
	
	@Transactional
	@Override
	public Long insert(Product entity) throws Exception {
		return productRepository.insert(entity);
	}
	
	@Transactional
	@Override
	public Long update(Product entity) throws Exception {
		return productRepository.update(entity);
	}

	@Override
	public List<Product> findAll() throws Exception {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Product entity) throws Exception {
		return productRepository.findById(entity);
	}

}
