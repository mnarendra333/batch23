package com.pragim.springjdbccrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pragim.springjdbccrud.model.Seller;
import com.pragim.springjdbccrud.util.MyResultSetExtractor;
import com.pragim.springjdbccrud.util.MyRowMapper;
@Component
public class SpringJdbcBean {
	
	@Autowired
	private JdbcTemplate  jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	public void saveSeller() {
		jt.execute("insert into seller values(5,'bangl','vijay electronics')");
	}
	
	
	public void updateSeller(int selId, String loc) {
		jt.update("update seller set LOCATION=? where SELID=?", new Object[] {loc,selId});
	}
	
	public void deleteSeller(String name) {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("key", name);
		System.out.println(parameters);
		jt.update("delete from seller where SELLERNAME =:key",parameters.get("key"));
		System.out.println("Done......!!!");
	}
	
	
	public void findAll() {
		List<Map<String, Object>> queryForList = jt.queryForList("select * from seller");
		System.out.println(queryForList);
	}
	
	
	public void selectUsingResultSetExt() {
		List<Seller> data = jt.query("select * from seller", new ResultSetExtractor<List<Seller>>() {

			@Override
			public List<Seller> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
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
		});
		
		
		for (Seller seller : data) {
			System.out.println(seller);
		}
	}
	
	
	public void queryWithResultSetExtUsingNewClass() {
		List<Seller> query = 
				jt.query("select * from seller", new MyResultSetExtractor());
		for (Seller seller : query) {
			System.out.println(seller);
		}
	}
	
	
	public void queryDataUsingRowMapper() {
		List<Seller> sellerList = jt.query("select * from seller", 
				new RowMapper<Seller>() {

			@Override
			public Seller mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Seller seller = new Seller();
				seller.setSelId(rs.getInt(1));
				seller.setLocation(rs.getString(2));
				seller.setSelName(rs.getString(3));
				
				return seller;
			}
		});
		
		sellerList.forEach(System.out::println);
	}
	
	public void queryUsingRowMapperNewClass() {
		List<Seller> list = jt.query("select * from seller", new MyRowMapper());
		for (Seller seller : list) {
			System.out.println(seller);
		}
		
		list.forEach(obj->System.out.println(obj));
		
		//list.forEach(System.out::println);
	}
	
	public void selectData() {
		List<Seller> list = jt.query("select * from seller where SELLERNAME=?", new Object[] {"PMS"},new MyRowMapper());
		list.forEach(System.out::println);
	}

}
