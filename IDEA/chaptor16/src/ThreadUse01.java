public class ThreadUse01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        //当 main 线程启动一个子进程 Thread-0，主线程不会阻塞，会继续执行
        System.out.println("主进程继续执行");
        for (int i = 0; i < 40; i++) {
            System.out.println("主线程" + i);
            Thread.sleep(1000);
        }
    }
}

//1. 当类继承了 Thread 就可以当作一个线程
//2. 重写 run
//3. run 是 Thread 类实现了 Runnable 接口的 run 方法
/*
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread {
    private int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵 " + (++times));
            System.out.println("线程: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 50) {
                break;
            }
        }
    }
}