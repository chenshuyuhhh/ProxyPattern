package com.company;

public interface Subject {
    void setNumber(int number);//代理人可以帮忙做的事
    int getNumber();//代理人可以帮忙做的事
    void displayNumber();//只有本人才能做的事
}
