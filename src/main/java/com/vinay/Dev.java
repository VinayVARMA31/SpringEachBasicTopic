package com.vinay;

public class Dev {
    private Computer com;
    
    public void build(){
        System.out.println("The dev is working.");
        com.build();
    }


    public Computer getCom() {
        return com;
    }


    public void setCom(Computer com) {
        this.com = com;
    }
}
