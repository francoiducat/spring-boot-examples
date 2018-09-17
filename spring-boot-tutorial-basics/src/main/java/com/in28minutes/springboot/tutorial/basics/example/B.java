package com.in28minutes.springboot.tutorial.basics.example;

public class B extends A {

  @Override public String getMe() {
    return super.getMe() + "B";
  }
}
