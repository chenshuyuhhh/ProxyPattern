package com.company;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Proxy(5);
        System.out.println("现在的数字是 ：" + subject.getNumber());//获得数字代理即可完成
        subject.setNumber(12);//设置数字，代理也可以完成
        System.out.println("设置后的数字是 ：" + subject.getNumber());//获得数字代理即可完成
        System.out.println("打印出数字（只能由本人完成）");
        subject.displayNumber();
    }
}
