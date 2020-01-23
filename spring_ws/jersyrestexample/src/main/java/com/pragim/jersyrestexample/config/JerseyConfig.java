package com.pragim.jersyrestexample.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.pragim.jersyrestexample.controller.UserController;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(UserController.class);
	}
}
