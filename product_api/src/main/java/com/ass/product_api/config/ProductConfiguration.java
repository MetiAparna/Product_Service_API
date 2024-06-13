package com.ass.product_api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.ass.product_api")
public class ProductConfiguration {
	

}
