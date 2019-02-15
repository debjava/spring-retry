package com.ddlab.rnd;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;

@ComponentScan(basePackages = "com.ddlab.rnd")
@Configuration
@EnableRetry
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyConfig {
	
}
