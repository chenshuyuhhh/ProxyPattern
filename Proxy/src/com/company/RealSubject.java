package com.company;

public class RealSubject implements Subject {

    private int number;

    public RealSubject(){
        System.out.println("正在生成本人实例");
    }//非参构造函数

    public RealSubject(int number){
        this.number = number;
        System.out.println("正在生成本人实例");
    }//构造函数

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void displayNumber() {
        System.out.println("只有本人才能做的事 ：");
        System.out.println(number);
    }//只有本人才能做的事
}
