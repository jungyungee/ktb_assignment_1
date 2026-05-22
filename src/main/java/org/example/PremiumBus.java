package org.example;

import java.util.Scanner;

public class PremiumBus extends Bus {
    private boolean isOneSeat; // 1인석 여부

    // 생성자를 통한 프리미엄 버스의 가격과 시간 설정
    public PremiumBus(){
        this.time = "2시간 50분";
        this.price = 18000;
    }

    // 좌석 종류 선택 메소드
    public void selectSeat(Scanner sc){

        System.out.println("좌석 선택");
        System.out.println("1. 1인석");
        System.out.println("2. 2인석");

        int seat = sc.nextInt();

        if (seat == 1){
            isOneSeat = true;
            System.out.println("1인석을 선택하셨습니다.");
        }
        else if (seat == 2){
            isOneSeat = false;
            System.out.println("2인석을 선택하셨습니다.");
        }
        else {
            System.out.println("1 또는 2를 입력해주세요");
        }
    }

    // 부모 클래스의 printInfo 메소드에 좌석 정보를 추가하기 위해 오버라이딩
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(isOneSeat ? "좌석: 1인석" : "좌석: 2인석");
    }
}