package com.in28minutes.springboot.tutorial.basics.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSingleton {

  private String name;

  @Autowired
  public ServiceSingleton(ServiceSingletonInIt it) {
    //...
  }

  public String showMessage() {
    return "I am here" + name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
