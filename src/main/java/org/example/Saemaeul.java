package org.example;

import java.util.Scanner;

public class Saemaeul extends Train{
    private int stopCount = 7; // 정차역 수 저장

    // 생성자를 통한 새마을의 시간, 가격 설정
    public Saemaeul(){
        this.time = "3시간 30분";
        this.price = 15000;
    }

    // 정차역 정보 출력 메소드
    public void printStopInfo(){
        System.out.println("새마을호의 정차역 수는 " + stopCount + "개 입니다.");
    }

    // 부모 클래스의 printInfo에 정차역 정보를 출력하는 메소드를 추가해 오버라이딩
    @Override
    public void printInfo(){
        super.printInfo();
        printStopInfo();
    }
}
