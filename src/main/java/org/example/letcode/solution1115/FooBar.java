package org.example.letcode.solution1115;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

class FooBar {
    private volatile int n;

    public FooBar(int n) {
        this.n = n;
        try {
            semaphore2.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(1);
    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore1.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphore2.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore2.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphore1.release();
        }
    }
}
