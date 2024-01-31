class Multithreading2 implements Runnable{
    public void run(){
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        }
        catch (Exception e){
            System.out.println("Excption is caught");
        }
    }
}

//main class
class Multithread1{
    public static void main(String args[]){
        int n = 8;
        for(int i = 0;i<=5;i++){
            Thread obj = new Thread(new Multithreading2());
            obj.start();
        }
    }
}