package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFunctionality1 {

  @Autowired 
  private MyService myService;

  public void perform() {
    String someResponse = myService.invokeMe("s");
    System.out.println("Some Response :::" + someResponse);
  }
}
