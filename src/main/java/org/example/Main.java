package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 프로그램 시작
        System.out.println("이동수단 예매 프로그램에 오신 것을 환영합니다!");
        System.out.println("-----------------------------------");
        // 이동 수단 종류 선택

        while (true) {
            System.out.println("1. 기차");
            System.out.println("2. 버스");
            System.out.println("번호를 입력하세요:");
            int vehicleType = sc.nextInt();

            // 이동 수단 종류에 따른 분기
            if (vehicleType == 1){
                System.out.println("원하는 기차 종류를 선택해주세요");
                System.out.println("1. KTX");
                System.out.println("2. 새마을");
                System.out.println("번호를 입력하세요:");
                int trainType = sc.nextInt();

                Train train = new Train();

                if (trainType == 1){
                    KTX ktx = new KTX();

                    ktx.selectSeatType(sc);
                    train.selectRoom(sc);
                    ktx.printInfo();
                    ktx.book();
                    System.out.println("예매가 완료되었습니다.");
                    break;
                }
                else if (trainType == 2){
                    Saemaeul saemaeul = new Saemaeul();

                    train.selectRoom(sc);
                    saemaeul.printInfo();
                    saemaeul.book();
                    System.out.println("예매가 완료되었습니다,");
                    break;
                }
            }
            else if (vehicleType == 2){
                System.out.println("원하는 버스 종류를 선택해주세요");
                System.out.println("1. 일반 고속버스");
                System.out.println("2. 프리미엄 고속버스");
                System.out.println("번호를 입력하세요:");
                int busType = sc.nextInt();

                Bus bus = new Bus();
                bus.selectBrand(sc);

                if (busType == 1){
                    NormalBus normalBus = new NormalBus();
                    normalBus.printInfo();
                    normalBus.book();
                    System.out.println("예매가 완료되었습니다,");
                    break;
                }

                else if (busType == 2){
                    PremiumBus premiumBus = new PremiumBus();
                    premiumBus.selectSeat(sc);
                    premiumBus.printInfo();
                    premiumBus.book();
                    System.out.println("예매가 완료되었습니다,");
                    break;
                }
            } else {
                // 예외 입력 처리
                System.out.println("1 또는 2번 중에 입력하세요:");
            }
        }
    }
}