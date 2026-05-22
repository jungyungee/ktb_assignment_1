package org.example;

import java.util.Scanner;

// Bus 계열의 하위 이동수단들의 공통 속성과 메소드를 가지는 부모 클래스 (Vechicle의 자식)
public class Bus extends Vehicle {

    private String brand; //버스 브랜드

    // 버스 브랜드 입력 받아 선택하는 메소드
    public void selectBrand(Scanner sc){

        System.out.println("버스 브랜드를 선택해주세요");
        System.out.println("1. 기아");
        System.out.println("2. 현대");

        int busBrand = sc.nextInt();

        // 사용자 입력 (int)를 브랜드 이름 (문자열)로 변환 저장
        if (busBrand == 1){
            brand = "기아";
        } else if (busBrand == 2){
            brand = "현대";
        } else {
            brand = "알 수 없음";
            System.out.println("1 또는 2를 입력해주세요");
        }

        System.out.println("선택된 브랜드: " + brand);
    }
}