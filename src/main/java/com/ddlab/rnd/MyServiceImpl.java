package com.ddlab.rnd;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {

  private static int counter = 0;

  @Retryable(
    value = {IllegalArgumentException.class},
    maxAttempts = 5,
    backoff = @Backoff(1000)
  )
  public String invokeMe(String param) {
    System.out.println("Going to invoke this method ..." + (++counter));
    if (param.equals("s")) throw new IllegalArgumentException();
    return "Now response : " + param;
  }

  @Recover
  public String recoverAndFallback(IllegalArgumentException exception) {
    System.out.println("You have reached to the end of all attempts...");
    System.out.println("Better luck next time ...");
    return "Better luck next time ...";
  }
}
