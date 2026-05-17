package org.example;

public class NormalBus extends Bus {

    private boolean isStopping = true;

    public NormalBus(){
        this.time = "3시간";
        this.price = 12000;
    }

    public void printStopInfo(){
        System.out.println("정차여부: " + (isStopping ? "있음" : "없음"));
    }

    @Override
    public void printInfo(){
        super.printInfo();
        printStopInfo();
    }
}