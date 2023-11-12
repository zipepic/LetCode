package org.example.letcode.solution1114;

import java.util.concurrent.CountDownLatch;

class Foo {

    public Foo() {

    }

    public static void main(String[] args) throws InterruptedException {
        Foo f = new Foo();
        f.second(() -> System.out.println("second"));
        f.first(() -> System.out.println("first"));
        f.third(() -> System.out.println("third"));
    }
    CountDownLatch countDownLatch1 = new CountDownLatch(1);
    CountDownLatch countDownLatch2 = new CountDownLatch(1);
    public  void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.

        printFirst.run();
        countDownLatch1.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        countDownLatch1.await();
        printSecond.run();
        countDownLatch2.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        countDownLatch2.await();
        printThird.run();
    }
}
