package com.example.iset.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.iset.dao.*;
@Configuration
public class MyConfig {
@Bean
public ResourceConfig getJersey() {
	ResourceConfig config=new ResourceConfig();
	config.register(CompteRestService.class);
	return config;
}

}

