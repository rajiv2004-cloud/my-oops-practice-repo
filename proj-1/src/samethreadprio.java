import java.lang.*;
class samethreadprio extends Thread {
    public void run(){
        System.out.println("Inside the run method");
    }
    public static void main(String[] args){
        Thread.currentThread().setPriority(8);
        System.out.println("main thread  "+ Thread.currentThread().getPriority());
        samethreadprio t1 = new samethreadprio();
        System.out.println("t1 Thread priority "+ t1.getPriority());
    }
}
