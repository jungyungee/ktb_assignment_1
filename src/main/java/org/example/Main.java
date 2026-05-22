package org.example;
import java.util.Scanner;

// 프로그램의 실행 및 전체 흐름을 담당
public class Main {
    public static void main(String[] args){

        // 입력받는 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 프로그램 시작
        System.out.println("이동수단 예매 프로그램에 오신 것을 환영합니다!");
        System.out.println("-----------------------------------");
        // 이동 수단 종류 선택
        // 잘못된 입력 시에 다시 선택하는 화면이 나오도록 while 문 사용
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

                if (trainType == 1){
                    // KTX 객체 생성
                    KTX ktx = new KTX();

                    // ktx의 public 메소드들을 호출해서 기능 실행
                    ktx.selectSeatType(sc);
                    ktx.selectRoom(sc);
                    ktx.printInfo();
                    ktx.book();
                    System.out.println("예매가 완료되었습니다.");
                    // 프로그램 종료
                    break;
                }
                else if (trainType == 2){
                    // 새마을 객체 생성
                    Saemaeul saemaeul = new Saemaeul();

                    // saemaeul과 train의 public 메소드들을 호출해서 기능 실행
                    saemaeul.selectRoom(sc);
                    saemaeul.printInfo();
                    saemaeul.book();
                    System.out.println("예매가 완료되었습니다,");
                    // 프로그램 종료
                    break;
                }
            }
            else if (vehicleType == 2){
                System.out.println("원하는 버스 종류를 선택해주세요");
                System.out.println("1. 일반 고속버스");
                System.out.println("2. 프리미엄 고속버스");
                System.out.println("번호를 입력하세요:");

                int busType = sc.nextInt();

                if (busType == 1){
                    // 일반 버스 객체 생성
                    NormalBus normalBus = new NormalBus();

                    // normal bus의 public 메소드 호출
                    normalBus.selectBrand(sc);
                    normalBus.printInfo();
                    normalBus.book();
                    System.out.println("예매가 완료되었습니다,");
                    // 프로그램 종료
                    break;
                }

                else if (busType == 2){
                    // 프리미엄 버스 객체 생성
                    PremiumBus premiumBus = new PremiumBus();

                    // 프리미엄 버스의 메소드 호출
                    premiumBus.selectBrand(sc);
                    premiumBus.selectSeat(sc);
                    premiumBus.printInfo();
                    premiumBus.book();
                    System.out.println("예매가 완료되었습니다,");
                    // 프로그램 종료
                    break;
                }
            } else {
                // 예외 입력 처리
                System.out.println("1 또는 2번 중에 입력하세요:");
            }
        }
    }
}