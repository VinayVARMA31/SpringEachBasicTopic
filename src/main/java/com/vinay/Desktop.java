package com.vinay;

public class Desktop implements Computer {

    Desktop(){
        System.out.println("Desktop Constructor.");
 
    }

  @Override
  public void build(){
    System.out.println("The Desktop.");
  }
}
