package com.company;

public class Proxy implements Subject {
    private RealSubject realSubject;//本人。代理人持有本人的引用，当代理人无法完成要求时，再生成本人
    private int number;

    public Proxy(int number){
        this.number = number;
    }

    @Override
    public void setNumber(int number) {
            if(realSubject != null){
                //当本人不是null，则说明以及生成了本人的实例化对象，这时就可以直接让本人操作了
                realSubject.setNumber(number);
            }
            this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void displayNumber() {
        //这件事只用又本人来做，所以要生成“本人”
        realize();
        realSubject.displayNumber();

    }
    private void realize(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
    }
}
