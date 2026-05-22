package org.example;

public class NormalBus extends Bus {

    private boolean isStopping = true; //정차여부

    // 생성자를 통한 일반고속 버스의 시간, 가격 설정
    public NormalBus(){
        this.time = "3시간";
        this.price = 12000;
    }

    // 정차 여부 출력하는 메소드
    public void printStopInfo(){
        System.out.println("정차여부: " + (isStopping ? "있음" : "없음"));
    }

    // 부모 클래스의 printInfo에 정차가능 메소드를 추가
    @Override
    public void printInfo(){
        super.printInfo();
        printStopInfo();
    }
}