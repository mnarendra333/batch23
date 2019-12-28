package com.pragim.springjdbccrud.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.pragim.springjdbccrud.model.Seller;

public class MyResultSetExtractor implements ResultSetExtractor<List<Seller>>{

	@Override
	public List<Seller> extractData(ResultSet rs) throws SQLException, 
	DataAccessException {
		// TODO 
		
		List<Seller> sellerList = new ArrayList<Seller>();
		while (rs.next()) {
			Seller seller = new Seller();
			seller.setSelId(rs.getInt(1));
			seller.setLocation(rs.getString(2));
			seller.setSelName(rs.getString(3));
			sellerList.add(seller);
		}
		return sellerList;
	}

}
