package org.example;

public class Vehicle {
    protected String time; //소요 시간
    protected int price; //가격

    public void printInfo(){
        System.out.println("소요시간: "+time);
        System.out.println("가격: "+price);
    }

    public void book(){
        System.out.println("예매를 원할 시 "+price+"원을 입금해주세요");
    }


}
