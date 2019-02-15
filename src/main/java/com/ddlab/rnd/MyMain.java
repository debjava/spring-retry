package com.ddlab.rnd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
public class MyMain {
  public static void main(String[] args) {
	  ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	  MyFunctionality1 functionality = context.getBean(MyFunctionality1.class);
	  functionality.perform();
  }
}
