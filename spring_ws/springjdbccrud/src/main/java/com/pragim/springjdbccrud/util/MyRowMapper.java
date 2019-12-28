package com.pragim.springjdbccrud.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pragim.springjdbccrud.model.Seller;

public class MyRowMapper implements RowMapper<Seller> {

	@Override
	public Seller mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Seller seller = new Seller();
		seller.setSelId(rs.getInt(1));
		seller.setLocation(rs.getString(2));
		seller.setSelName(rs.getString(3));
		return seller;
	}

}
