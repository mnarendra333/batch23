package com.pragim.springmvccrudapp.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pragim.springmvccrudapp.model.Product;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProId(rs.getInt(1));
		product.setProName(rs.getString(2));
		product.setPrice(rs.getDouble(3));
		product.setProDesc(rs.getString(4));
		return product;
	}

}
