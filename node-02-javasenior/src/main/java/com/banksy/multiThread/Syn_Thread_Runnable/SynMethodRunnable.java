package com.banksy.multiThread.Syn_Thread_Runnable;

import org.junit.Test;

/**
 * 同步方法Runnable
 *
 * 关于同步方法的总结：
 *  1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 *  2. 非静态的同步方法，同步监视器是：this
 *     静态的同步方法，同步监视器是：当前类本身
 *
 * @Author banksy
 * @Data 2022/9/15 8:13 PM
 * @Version 1.0
 **/
class Window3 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            show();
        }
    }

    public synchronized void show(){
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
            ticket--;
        }
    }

}

public class SynMethodRunnable{
    @Test
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}