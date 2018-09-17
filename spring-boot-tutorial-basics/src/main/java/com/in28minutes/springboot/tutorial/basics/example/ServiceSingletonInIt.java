package com.in28minutes.springboot.tutorial.basics.example;

public class ServiceSingletonInIt {

  public ServiceSingletonInIt(String name) {
    this.name = name;
  }

  private String name;

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
