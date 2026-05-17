package org.example;

import java.util.Scanner;

public class Saemaeul extends Train{
    private int stopCount = 7;

    public Saemaeul(){
        this.time = "3시간 30분";
        this.price = 15000;
    }

    public void printStopInfo(){
        System.out.println("새마을호의 정차역 수는 " + stopCount + "개 입니다.");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        printStopInfo();
    }
}
