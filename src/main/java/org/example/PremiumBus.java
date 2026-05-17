package org.example;

import java.util.Scanner;

public class PremiumBus extends Bus {

    private boolean isOneSeat;

    public PremiumBus(){
        this.time = "2시간 50분";
        this.price = 18000;
    }

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

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(isOneSeat ? "좌석: 1인석" : "좌석: 2인석");
    }
}