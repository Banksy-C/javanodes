package com.banksy.multiThread.Syn_Thread_Runnable;

import org.junit.Test;

/**
 * 同步代码块Thread
 *
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 *
 * @Author banksy
 * @Data 2022/9/15 8:12 PM
 * @Version 1.0
 **/

class Window2 extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}


public class SynLumpThread{
    @Test
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}