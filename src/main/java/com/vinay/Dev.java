package com.vinay;

public class Dev {


    private Laptop lap;

    
    public Dev(int val) {
        this.val = val;
    }
    private int val;
     Dev(){
        System.out.println("Dev Constructor");
    }
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    public Dev(Laptop lap) {
        this.lap = lap;
    }
    public Laptop getLap() {
        return lap;
    }
    public void setLap(Laptop lap) {
        this.lap = lap;
    }
    public void build(){
        System.out.println("The dev is working.");
        lap.build();
    }
}
