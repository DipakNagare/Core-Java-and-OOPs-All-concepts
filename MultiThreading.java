class SimpleThread extends Thread{

    public void run(){
        System.out.println("run method inside the thread class");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Which ThreadGroup under " +  Thread.currentThread().getThreadGroup().getName());
            
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    // if any class super class is thread class and if we want to invoke the constructor using super method.
    public SimpleThread(){
        super();
        start();
    }

}

class ThreadRunable implements Runnable{ // thread class must we have run() method

    // in this Runnable interface we must want to override the Thread class method otherwise they give error
    public void run(){
        System.out.println("run method inside the Runnale Interface ");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Which ThreadGroup under " + Thread.currentThread().getThreadGroup().getName());
            
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // this class super class is runnable interface and if we want invoke the constuctor then we want to create the object of above thread class. 
    public ThreadRunable(){  // in this we create the constructor of runnable Interface and using this constructor i create object of above thread class.
        Thread Th = new Thread(this);
        Th.start();
    }

}
public class MultiThreading {
    
    public static void main(String[] args) {
        SimpleThread St = new SimpleThread();
        ThreadRunable TR = new ThreadRunable();
    }
}
