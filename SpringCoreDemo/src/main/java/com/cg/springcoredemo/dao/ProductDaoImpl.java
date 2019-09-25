package com.cg.springcoredemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springcoredemo.dto.Product;

@Repository("productdao")
public class ProductDaoImpl implements ProductDao {
	List<Product> productList = new ArrayList<Product>();

	public Product addProduct(Product pro) {
		// TODO Auto-generated method stub
		productList.add(pro);
		return pro;
	}

	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return productList;
	}

}
