package org.example;

// 하위의 모든 이동 수단 클래스가 공통으로 가지는 속성, 메소드를 가지는 조부모클래스
public class Vehicle {
    protected String time; //소요 시간
    protected int price; //가격

    // 이동시간의 정보를 출력하는 메소드
    public void printInfo(){
        System.out.println("소요시간: "+time);
        System.out.println("가격: "+price);
    }

    // 예매를 안내하는 문구를 출력 (별다른 기능은 없음)
    public void book(){
        System.out.println("예매를 원할 시 "+price+"원을 입금해주세요");
    }


}
