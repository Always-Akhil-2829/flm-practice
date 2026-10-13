package com.spring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com")
@PropertySource("classpath:applications.properties")
public class SpringConfig {
}
