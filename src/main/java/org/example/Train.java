package org.example;

import java.util.Scanner;

// Train 계열의 하위 이동수단들의 공통 속성과 메소드를 가지는 부모 클래스 (Vechicle의 자식)
public class Train extends Vehicle {
    private int roomNum; // 호실 정보 저장

    // 기차 호실을 입력받아 저장하는 메소드
    public void selectRoom(Scanner sc){

        System.out.println("원하는 호실을 선택해주세요.");

        roomNum = sc.nextInt();

        System.out.println("선택된 호실 구간: " + roomNum);
    }
}
