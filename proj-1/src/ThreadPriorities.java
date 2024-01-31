import java.lang.*;
class ThreadPriorities extends Thread {
    public void run(){
        System.out.println("Inside run meethod");
    }
    public static void main(String [] args){
        //creating random thread
        ThreadPriorities t1 = new ThreadPriorities();
        ThreadPriorities t2 = new ThreadPriorities();
        ThreadPriorities t3 = new ThreadPriorities();

        //Setting prioiority of above therads
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        //Display the priority of the above thread
        //using getPriority method
        System.out.println("t1 thread priority "+ t1.getPriority());
        System.out.println("t2 thread priority "+ t2.getPriority());
        System.out.println("t3 thread priority "+ t3.getPriority());
    }
}
