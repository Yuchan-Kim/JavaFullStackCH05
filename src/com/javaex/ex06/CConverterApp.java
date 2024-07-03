package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar = 100;
        double won = 1000000;
        
        CConverter.setRate(1118.70);
        
        CConverter converter = new CConverter();
        //100만원을 달러로 출력하기
        double wontoDollar = converter.toDoller(won);
        System.out.println("백만원은 " + wontoDollar + "달러 입니다.");
        
        //100달러를 원으로 출력하기
        double dollartoWon = converter.toKWR(dollar);
        System.out.println("백달러는 " + dollartoWon + "입니다.");
        
    }

}
