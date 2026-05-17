package org.example;

import java.util.Scanner;

public class Train extends Vehicle {
    public void selectRoom(Scanner sc){
        System.out.println("원하는 호실을 선택해주세요.");

        int roomNum = sc.nextInt();

        System.out.println("선택된 호실 구간: " + roomNum);
    }
}
