class MultiThreading extends Thread{
    public void run(){
        try {
            System.out.println("Thread "+ Thread.currentThread().getId() + " is running");
        }
        catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}

//main class
class Multithread{
    public static void main(String[] args){
        int n= 18;
        for (int i = 0; i < n; i++){
            MultiThreading obj = new MultiThreading();
            obj.start();
        }
    }
}