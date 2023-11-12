package org.example.letcode.solution1116;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(1000);
        Thread t0 = new Thread(() -> {
            try {
                zeroEvenOdd.zero((a) -> System.out.print(a));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t1 = new Thread(() -> {
            try {
                zeroEvenOdd.odd((a) -> System.out.print(a));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                zeroEvenOdd.even((a) -> System.out.print(a));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t0.start();
        t1.start();
        t2.start();

        try {
            t0.join();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private int n;
    private volatile int count;
    Semaphore runZero;
    Semaphore runEven;
    Semaphore runOdd;

    public ZeroEvenOdd(int n) {
        this.n = n;
        count = 1;
        runZero = new Semaphore(1);
        runEven = new Semaphore(0);
        runOdd = new Semaphore(0);

    }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero (IntConsumer printNumber) throws InterruptedException {
            runZero.acquire();
            printNumber.accept(0);
            if (count % 2 == 0) {
                runEven.release();
            } else {
                runOdd.release();
            }
        }

        public void even (IntConsumer printNumber) throws InterruptedException {
            runEven.acquire();
            printNumber.accept(count++);
            runZero.release();
        }

        public synchronized void odd (IntConsumer printNumber) throws InterruptedException {
            runOdd.acquire();
            printNumber.accept(count++);
            runZero.release();
        }
}
//            System.out.println("in odd (2)");
//            System.out.println("\nodd " + runOdd.availablePermits() );
//            System.out.println("even " + runEven.availablePermits() );
//            System.out.println("zero " + runZero.availablePermits()+"\n" );
