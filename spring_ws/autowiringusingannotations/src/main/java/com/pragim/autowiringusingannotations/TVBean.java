package com.pragim.autowiringusingannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TVBean {

	@Autowired
	@Qualifier(value = "remote")
	private Remote rem;

	public void setRem(Remote rem) {
		this.rem = rem;
	}

	public TVBean(Remote rem) {
		super();
		this.rem = rem;
	}

	public void start() {
		rem.powerOn();
	}

}
