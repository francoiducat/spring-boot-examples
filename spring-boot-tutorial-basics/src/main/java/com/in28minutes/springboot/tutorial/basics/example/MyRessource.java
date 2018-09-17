package com.in28minutes.springboot.tutorial.basics.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.hibernate5.SpringSessionContext;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import javax.xml.ws.Service;

@RestController
public class MyRessource {

   private ServiceSingleton service;

   @Autowired
   public MyRessource(ServiceSingleton service) {
     this.service = service;
   }

  public ResponseEntity helloWorld() {

    String msgObjt = service.showMessage();

    return ResponseEntity.ok(msgObjt);
  }

  public ResponseEntity helloWorld2() {

    String msgObjt = service.showMessage();

    return ResponseEntity.ok(msgObjt + " 2");
  }
}
