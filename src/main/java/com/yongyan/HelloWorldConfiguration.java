package com.yongyan;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yongyan on 09/08/2018
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.yongyan")
public class HelloWorldConfiguration {

}
