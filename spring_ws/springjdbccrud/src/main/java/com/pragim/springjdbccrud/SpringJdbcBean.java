package com.pragim.springjdbccrud;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcBean {
	
	
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

}
