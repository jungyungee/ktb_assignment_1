package org.example;

import java.util.Scanner;

public class Bus extends Vehicle {

    private String brand;

    public void selectBrand(Scanner sc){

        System.out.println("버스 브랜드를 선택해주세요");
        System.out.println("1. 기아");
        System.out.println("2. 현대");

        int busBrand = sc.nextInt();

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