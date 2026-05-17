package org.example;

import java.util.Scanner;

public class KTX extends Train{
    private boolean isSpecial;

    public KTX(){
        this.time = "2시간";
        this.price = 23700;
    }

    public void selectSeatType(Scanner sc){
        System.out.println("특실과 일반실 중 선택가능합니다.");
        System.out.println("1. 특실(1-2호차)");
        System.out.println("2. 일반실(3-10호차)");
        System.out.println("특실을 원할 경우 1, 일반실을 원할경우 2를 입력해주세요: ");

        int roomType = sc.nextInt();
        isSpecial = (roomType == 1);

        if (roomType == 1){
            System.out.println("특실이 선택되었습니다.");
        } else if (roomType == 2){
            System.out.println("일반실이 선택되었습니다.");
        }
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(isSpecial ? "특실" : "일반실");
    }
}
