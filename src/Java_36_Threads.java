//Thread
class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("My thread is running");
            System.out.println("I am happy");
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("Thread 1 is good");
            System.out.println("I am sad");
        }
    }
}

//Runnable
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 1");
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 2");
    }
}

public class Java_36_Threads {
    static void main(String[] args) {
        //Thread
//        MyThread myThread = new MyThread();
//        MyThread1 myThread1 = new MyThread1();
//        myThread.start();
//        myThread1.start();

        //Runnable
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        System.out.println("Get id of thread " + gun1.threadId());
        gun2.start();
    }
}
